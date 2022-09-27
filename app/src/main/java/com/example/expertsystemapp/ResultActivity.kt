package com.example.expertsystemapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.expertsystemapp.Services.Constants
import com.example.expertsystemapp.Services.Food
import com.example.expertsystemapp.Services.Question

class ResultActivity: AppCompatActivity() {
    private lateinit var titleText: TextView
    private lateinit var foodView: ImageView
    private lateinit var urlBtn: Button
    private lateinit var restartBtn: Button

    private var foodList: ArrayList<Food> ?= null
    private var url: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var p1 = intent.getStringExtra("Гарнир").toString()
        var p2 = intent.getStringExtra("Основа").toString()
        init()

        foodList = Constants.getFoodList()
        checkList(p1, p2)

        restartBtn.setOnClickListener {
            val i = Intent(this, MainActivity::class.java) //Инициализация интента для открытия новой активити
            startActivity(i) //Старт активити
            finish()
        }

        urlBtn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }

    private fun checkList(p1: String, p2: String) {
        var size = foodList!!.size

        try {
            for (i in 0..size){
                var food = foodList!![i]
                if (p1.equals(food.parameterOne, true) && p2.equals(food.parameterTwo, true)){
                    var res = "Ваше блюдо: \n${food.title}"
                    titleText.text = res
                    url = food.url
                    foodView.setImageResource(food.image)
                    urlBtn.isEnabled = true
                    return
                }
            }
        }
        catch (e: Exception){
            titleText.text = "Такого блюда я не знаю \n ${p1} + ${p2}"
            urlBtn.isEnabled = false
        }

    }

    private fun init(){
        titleText = findViewById(R.id.titleText)
        foodView = findViewById(R.id.foodView)
        urlBtn = findViewById(R.id.urlBtn)
        restartBtn = findViewById(R.id.restartBtn)
    }
}