package com.example.weatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Second_SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_splash_screen)
        lateinit var tempInputs: Array<EditText>
        lateinit var averageTextView: TextView
        val temperatures = DoubleArray(7)

        fun inputTemperatures(): Boolean {


            fun onCreate(savedInstanceState: Bundle?) {
                setContentView(R.layout.activity_main)

                // Initialize input fields
                tempInputs = arrayOf(
                    findViewById(R.id.Monday),
                    findViewById(R.id.tempTuesday),
                    findViewById(R.id.tempWednesday),
                    findViewById(R.id.tempThursday),
                    findViewById(R.id.tempFriday),
                    findViewById(R.id.tempSaturday),
                    findViewById(R.id.tempSunday)
                )

                averageTextView = findViewById(R.id.averageTextView)

                // Calculate average temperature
                findViewById<Button>(R.id.button4).setOnClickListener {
                    if (inputTemperatures()) {
                        val average = temperatures.average()
                        averageTextView.text = "Average Temperature: %.2f".format(average)
                    }
                }


                // Exit the app
                findViewById<Button>(R.id.button4).setOnClickListener {
                    finish()
                }
            }

            fun inputTemperatures(): Boolean {
                for (i in tempInputs.indices) {
                    val tempText = tempInputs[i].text.toString()
                    if (tempText.isEmpty()) {
                        Toast.makeText(this, "Please enter all temperatures.", Toast.LENGTH_SHORT)
                            .show()
                        return false
                    }
                    temperatures[i] = tempText.toDoubleOrNull() ?: run {
                        Toast.makeText(this, "Please enter valid temperatures.", Toast.LENGTH_SHORT)
                            .show()
                        return false
                    }
                }
                return true
            }
        }



