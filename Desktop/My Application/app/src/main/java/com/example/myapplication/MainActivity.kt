package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        calculateButton.setOnClickListener{
            val height = findViewById<TextView>(R.id.heightEdit).text.toString()
            val weight = findViewById<TextView>(R.id.weightEdit).text.toString()
            val bmi = weight.toString().toDouble() / (height.toString().toDouble() / 100 * height.toString().toDouble() / 100)
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Индекс массы тела - ",bmi)
            startActivity(intent)
           }

        }

    }


