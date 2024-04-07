package com.example.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data class HistoricalFigure(val name: String, val age: Int)


        val famousPeople = listOf(
            HistoricalFigure("Benjamin Franklin", 84),
            HistoricalFigure("J.Robert Oppenheimer", 62),
            HistoricalFigure("Maya Angelou", 86),
            HistoricalFigure("Karl Rapp", 79),
            HistoricalFigure("Tupac Shakur", 25),
            HistoricalFigure("Chadwick Boseman", 43),
            HistoricalFigure("Amelia Earhart", 39),
            HistoricalFigure("Mary Jackson", 83),
            HistoricalFigure("Marilyn Monroe", 36),
            HistoricalFigure("John Lennon", 95),
            HistoricalFigure("Tom Clancy", 66),
            HistoricalFigure("Lisa Lopes", 30),
            HistoricalFigure("Ken Block", 55)
        )

        val Generate = findViewById<Button>(R.id.btnSearch)
        val InputAge = findViewById<EditText>(R.id.etAge)
        val remove = findViewById<Button>(R.id.btnRem)
        val ShowResult = findViewById<TextView>(R.id.tvDisplay)

        remove.setOnClickListener {
            InputAge.text.clear()
        }

        Generate.setOnClickListener {
            val userAge = InputAge.text.toString().toIntOrNull()
            if (userAge in 20..100) {
                val matchingPerson = famousPeople.find { it.age == userAge }


                    if (matchingPerson != null) {
                        ShowResult.text = "You are $userAge years old, the same age as ${matchingPerson.name}"

                    } else {
                        ShowResult.text = "No matches found!"
                    }

                    } else {
                    ShowResult.text = "Invalid input. Please enter age as whole number and within the range of 20 to 100"
                    }
                }
            }
        }













