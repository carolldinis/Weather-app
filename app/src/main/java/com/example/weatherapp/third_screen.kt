package com.example.weatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class third_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_screen)

        }
    }
private lateinit var detailedInfoLayout: LinearLayout
private lateinit var temperatures: DoubleArray
private val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    detailedInfoLayout = findViewById(R.id.detailedInfoLayout)
    val intent = null
    temperatures = intent.("temperatures")!!

    // Display detailed weather information
    displayDetailedInfo()

    // Navigate back to the main screen
    findViewById<Button>(R.id.backButton).setOnClickListener {
        finish()
    }
}



}



}


}



}



}

private fun displayDetailedInfo() {
    for (i in temperatures.indices) {
        val dayTextView = TextView(this)
        dayTextView.text = "${daysOfWeek[i]}: Max ${temperatures[i]}°C, Min ${temperatures[i] - 5}°C"
        dayTextView.textSize = 18f
        detailedInfoLayout.addView(dayTextView)
    }
}
}








