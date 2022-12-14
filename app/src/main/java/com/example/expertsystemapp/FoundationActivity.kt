package com.example.expertsystemapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.expertsystemapp.Services.Constants
import com.example.expertsystemapp.Services.Question

class FoundationActivity: AppCompatActivity(), View.OnClickListener {
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
    private var questionId: Int = 1
    private lateinit var p1: String
    private lateinit var p2: String
    private var result = ""
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        p1 = intent.getStringExtra("Гарнир").toString()
        p2 = intent.getStringExtra("Основа").toString()
        init()

        mQuestionsList = Constants.getTheThirdSection()
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
        questionId = question!!.id
        result = question!!.result
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, optionOne)
        options.add(0, optionTwo)

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
                    //    Toast.makeText(this, "Выбери ответ!", Toast.LENGTH_SHORT).show()

                    when{
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        } else -> {
                        val i = Intent(this, ResultActivity::class.java) //Инициализация интента для открытия новой активити
                        i.putExtra ( "Гарнир", "$p1" )
                        i.putExtra ( "Основа", "Грибы" )
                        startActivity(i) //Старт активити
                        finish()
                    }
                    }
                }
                else{
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
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
                if (questionId == 1){
                    val i = Intent(this, MeatActivity::class.java) //Инициализация интента для открытия новой активити
                    i.putExtra ( "Гарнир", "$p1" )
                    i.putExtra ( "Основа", "$p2" )
                    startActivity(i) //Старт активити
                    finish()
                }
                else{
                    val i = Intent(this, ResultActivity::class.java) //Инициализация интента для открытия новой активити
                    i.putExtra ( "Гарнир", "$p1" )
                    i.putExtra ( "Основа", "$result" )
                    startActivity(i) //Старт активити
                    finish()
                }
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
}