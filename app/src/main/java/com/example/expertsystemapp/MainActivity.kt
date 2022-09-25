package com.example.expertsystemapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.expertsystemapp.Services.Constants
import com.example.expertsystemapp.Services.Question

class MainActivity : AppCompatActivity() {
    private lateinit var questionText: TextView
    private lateinit var foodImg: ImageView
    private lateinit var optionOne: TextView
    private lateinit var optionTwo: TextView
    private lateinit var submitBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        val questionsList = Constants.getTheFirstSection()
        Log.i("Проверка вопросов", "${questionsList.size}")

        val currentPosition = 1
        val question: Question ?= questionsList[currentPosition - 1]

        questionText.text = question!!.question
        foodImg.setImageResource(question.image)
        optionOne.text = question!!.optionOne
        optionTwo.text = question!!.optionTwo

    }

    private fun init(){
        questionText = findViewById(R.id.question_text)
        foodImg = findViewById(R.id.food_img)
        optionOne = findViewById(R.id.option_one)
        optionTwo = findViewById(R.id.option_two)
        submitBtn = findViewById(R.id.submit_btn)
    }
}