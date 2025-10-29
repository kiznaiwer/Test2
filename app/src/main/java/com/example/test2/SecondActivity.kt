package com.example.test2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val textView = findViewById<TextView>(R.id.textViewName)
        val name = intent.getStringExtra("user name")

        textView.text = "Hello, $name"
    }
}