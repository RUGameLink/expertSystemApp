package com.example.expertsystemapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.expertsystemapp.Services.Constants

class ResultActivity: AppCompatActivity() {
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var p1 = intent.getStringExtra("Гарнир").toString()
        var p2 = intent.getStringExtra("Основа").toString()
        init()
        var res = "Гарнирчик: ${p1}\n" +
                "Основа: ${p2}"
        resultText.text = res
    }

    private fun init(){
        resultText = findViewById(R.id.resultText)
    }
}