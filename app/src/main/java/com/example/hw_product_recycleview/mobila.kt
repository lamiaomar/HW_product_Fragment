package com.example.hw_product_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class mobila : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobila)

        val pruduct = intent?.extras?.getString("iphone").toString()
        val text : TextView = findViewById(R.id.textView)
        text.text = pruduct
    }
}