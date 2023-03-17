package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
class MainActivity2 : AppCompatActivity() {
    @SuppressLint("ResourceType", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bmi = intent.getDoubleExtra("Индекс массы тела - ", 0.0)
        var result = findViewById<TextView>(R.id.resultText)
        result.text = "Индекс масса тела: $bmi"
        val background = findViewById<LinearLayout>(R.id.container)
        when {
            bmi < 18.5 ->{
                background.setBackgroundColor(resources.getColor(R.color.blue))
            }
            bmi < 25.5 ->{
                background.setBackgroundColor(resources.getColor((R.color.red)))
            }
            else ->{
                background.setBackgroundColor(resources.getColor(R.color.green))
            }
        }
        println("Индекс масса тела: $bmi")
    }
}

