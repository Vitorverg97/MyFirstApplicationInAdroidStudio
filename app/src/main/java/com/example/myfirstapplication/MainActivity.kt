package com.example.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val myButton: Button = findViewById(R.id.myButton)

            myButton.setOnClickListener {
                Toast.makeText(this, "Me dá um ponto?", Toast.LENGTH_SHORT).show()
            }
        }
    }
