package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()





        setContentView(R.layout.activity_main)
        val textView8 = findViewById<TextView>(R.id.textView8)
        val textView9 = findViewById<TextView>(R.id.textView9)
        val textView10 = findViewById<TextView>(R.id.textView10)
        val mainScreenButton = findViewById<Button>(R.id.mainscreenbutton)
        val exitbutton = findViewById<Button>(R.id.exitButton)

        val mainscreenbutton: Button = findViewById(R.id.mainscreenbutton)
        val exitButton: Button = findViewById(R.id.exitButton)

        mainScreenButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finish()
        }
    }
}




