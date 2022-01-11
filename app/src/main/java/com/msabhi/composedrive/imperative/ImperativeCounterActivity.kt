package com.msabhi.composedrive.imperative

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.msabhi.composedrive.R

class ImperativeCounterActivity : AppCompatActivity() {

    private var count = 0

    private val buttonDecrease by lazy { findViewById<Button>(R.id.button_decrease) }
    private val buttonIncrease by lazy { findViewById<Button>(R.id.button_increase) }
    private val textCount by lazy { findViewById<TextView>(R.id.text_count) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imperative_counter)

        textCount.text = count.toString()

        buttonDecrease.setOnClickListener {
            count--
            textCount.text = count.toString()
        }

        buttonIncrease.setOnClickListener {
            count++
            textCount.text = count.toString()
        }
    }
}