package com.example.expertsystemapp.Services


import android.provider.Settings.Secure.getString
import com.example.expertsystemapp.R

object Constants{
    fun getTheFirstSection(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Хочешь кушать?",
            R.drawable.food,
            "Хочу",
            "Не хочу",
            "Хочу"
        )
        questionsList.add(que1)

        val que2 = Question(
            1,
            "Точно не хочешь кушать?",
            R.drawable.food,
            "Хочу",
            "Не хочу",
            "Хочу"
        )
        questionsList.add(que2)

        return questionsList
    }
}