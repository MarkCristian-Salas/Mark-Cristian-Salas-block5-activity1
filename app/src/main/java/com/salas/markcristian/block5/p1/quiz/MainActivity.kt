package com.salas.markcristian.block5.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add your code here for initializing components, setting up listeners, etc.

        // Example: Set up a button click listener
        val myButton = findViewById<Button>(R.id.myButton)
        myButton.setOnClickListener {
            // Handle button click
        }
    }

    // Add more methods and components as needed
}
