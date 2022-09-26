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
            "Нет"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Точно не хочешь кушать?",
            R.drawable.food,
            "Хочу",
            "Не хочу",
            "Нет"
        )
        questionsList.add(que2)

        return questionsList
    }

    fun getTheSecondSection(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Супчик?",
            R.drawable.soup,
            "Да",
            "Нет",
               "Суп"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Что-нибудь с картошечкой??",
            R.drawable.potato,
            "Да",
            "Нет",
            "Картошка"
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Макарошки??",
            R.drawable.noodles,
            "Да",
            "Нет",
            "Макароны"
        )
        questionsList.add(que3)
        return questionsList
    }

    fun getTheThirdSection(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "С курочкой?",
            R.drawable.chicken,
            "Да",
            "Нет",
            "Курица"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "С говядинкой?",
            R.drawable.cow,
            "Да",
            "Нет",
            "Говядина"
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Со свининкой?",
            R.drawable.pig,
            "Да",
            "Нет",
            "Свинина"
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Со бараниной?",
            R.drawable.sheep,
            "Да",
            "Нет",
            "Баранина"
        )
        questionsList.add(que4)
        return questionsList
    }

    fun getTheFourthSection(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "С мясом?",
            R.drawable.chicken,
            "Да",
            "Нет",
            "Мясо"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "С овощами?",
            R.drawable.cow,
            "Да",
            "Нет",
            "Овощи"
        )
        questionsList.add(que2)

        return questionsList
    }
}