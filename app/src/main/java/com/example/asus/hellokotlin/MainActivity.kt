package com.example.asus.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tetx = findViewById<TextView>(R.id.text_hello)
        tetx.text = "Hello...Saya Suka Kotlin"
    }
}
