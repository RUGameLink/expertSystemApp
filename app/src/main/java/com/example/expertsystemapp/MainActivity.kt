package com.example.expertsystemapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.expertsystemapp.Services.Constants
import com.example.expertsystemapp.Services.Question

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //region Элементы управления
    private lateinit var questionText: TextView
    private lateinit var foodImg: ImageView
    private lateinit var optionOne: TextView
    private lateinit var optionTwo: TextView
    private lateinit var submitBtn: Button
    //endregion

    //region Переменные
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question> ?= null
    private var mSelectedOptionPosition: Int = 0
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        mQuestionsList = Constants.getTheFirstSection()
        setQuestion()

        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        submitBtn.setOnClickListener(this)
    }

    private fun setQuestion(){
        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            submitBtn.text = "Закончить"
        }
        else{
            submitBtn.text = "Ответить"
        }

        questionText.text = question!!.question
        foodImg.setImageResource(question.image)
        optionOne.text = question!!.optionOne
        optionTwo.text = question!!.optionTwo
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, optionOne)
        options.add(1, optionTwo)

        for (option in options){
            option.setTextColor(Color.parseColor("#E8E8E8"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.option_background
            )
        }
        submitBtn.isEnabled = false
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option_one -> {
                selectedOptionsView(optionOne, 1)
            }
            R.id.option_two -> {
                selectedOptionsView(optionTwo, 2)
            }
            R.id.submit_btn -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition ++
                    when{
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        } else -> {
                        val i = Intent(this, ResultActivity::class.java) //Инициализация интента для открытия новой активити
                        i.putExtra ( "Гарнир", "Нет" )
                        i.putExtra ( "Основа", "Нет" )
                        startActivity(i) //Старт активити
                        finish()
                    }
                    }

                }
                else{
                    answerView(mSelectedOptionPosition)
                    if (mCurrentPosition == mQuestionsList!!.size){
                        submitBtn.text = "Узнать результат"
                    }
                    else{
                        submitBtn.text = "Далее"

                    }

                    mSelectedOptionPosition = 0

                }
            }
        }
    }

    private fun answerView(answer: Int){
        when(answer){
            1 -> {
                val i = Intent(this, GarnishSectionActivity::class.java) //Инициализация интента для открытия новой активити
                startActivity(i) //Старт активити
                finish()
            }
            2 -> {
            }
        }

    }

    private fun selectedOptionsView(textView: TextView,
                                    selectedOptionNumber: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber

        textView.setTextColor(Color.parseColor("#E8E8E8"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_background
        )
        submitBtn.isEnabled = true
    }

    //region Инициализация элементов управления
    private fun init(){
        questionText = findViewById(R.id.question_text)
        foodImg = findViewById(R.id.food_img)
        optionOne = findViewById(R.id.option_one)
        optionTwo = findViewById(R.id.option_two)
        submitBtn = findViewById(R.id.submit_btn)
    }
    //endregion
}