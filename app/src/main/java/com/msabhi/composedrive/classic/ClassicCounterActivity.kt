package com.msabhi.composedrive.classic

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.msabhi.composedrive.R

class ClassicCounterActivity : AppCompatActivity() {

    //private val mutableStateFlow = MutableStateFlow(0)
    private var count = 0

    private val buttonDecrease by lazy { findViewById<Button>(R.id.button_decrease) }
    private val buttonIncrease by lazy { findViewById<Button>(R.id.button_increase) }
    private val textCount by lazy { findViewById<TextView>(R.id.text_count) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classic_counter)

        textCount.text = count.toString()

        buttonDecrease.setOnClickListener {
            count--
            textCount.text = count.toString()
            //mutableStateFlow.value = count - 1
        }

        buttonIncrease.setOnClickListener {
            count++
            textCount.text = count.toString()
            //mutableStateFlow.value = count+1
        }

        /*lifecycleScope.launch {
            mutableStateFlow.collect { textCount.text = it.toString() }
        }*/
    }
}