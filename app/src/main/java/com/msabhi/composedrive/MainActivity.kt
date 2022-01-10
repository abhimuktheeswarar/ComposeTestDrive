package com.msabhi.composedrive

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.msabhi.composedrive.classic.ClassicCounterActivity
import com.msabhi.composedrive.mixed.MixedCounterActivity

class MainActivity : AppCompatActivity() {

    private val buttonOpenClassicCounter by lazy { findViewById<Button>(R.id.button_open_classic_counter) }
    private val buttonOpenCompose by lazy { findViewById<Button>(R.id.button_open_pure_compose) }
    private val buttonOpenMixedCompose by lazy { findViewById<Button>(R.id.button_open_compose_mixed) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonOpenClassicCounter.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ClassicCounterActivity::class.java
                )
            )
        }
        buttonOpenCompose.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    RootActivity::class.java
                )
            )
        }
        buttonOpenMixedCompose.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MixedCounterActivity::class.java
                )
            )
        }
    }
}

