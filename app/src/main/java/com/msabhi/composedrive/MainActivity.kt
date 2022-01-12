package com.msabhi.composedrive

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.msabhi.composedrive.declarative.DeclarativeCounterActivity
import com.msabhi.composedrive.declarative.DeclarativeListActivity
import com.msabhi.composedrive.declarative.StarterComposeActivity
import com.msabhi.composedrive.imperative.ImperativeCounterActivity
import com.msabhi.composedrive.imperative.ImperativeListActivity
import com.msabhi.composedrive.mixed.MixedCounterActivity

class MainActivity : AppCompatActivity() {

    private val buttonOpenStarterCompose by lazy { findViewById<Button>(R.id.button_open_starter_compose) }

    private val buttonOpenImperativeCounter by lazy { findViewById<Button>(R.id.button_open_imperative_counter) }
    private val buttonOpenDeclarativeCounter by lazy { findViewById<Button>(R.id.button_open_declarative_counter) }

    private val buttonOpenImperativeList by lazy { findViewById<Button>(R.id.button_open_imperative_list) }
    private val buttonOpenDeclarativeList by lazy { findViewById<Button>(R.id.button_open_declarative_list) }


    private val buttonOpenCompose by lazy { findViewById<Button>(R.id.button_open_pure_compose) }
    private val buttonOpenMixedCompose by lazy { findViewById<Button>(R.id.button_open_compose_mixed) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonOpenStarterCompose.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    StarterComposeActivity::class.java
                )
            )
        }
        buttonOpenImperativeCounter.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ImperativeCounterActivity::class.java
                )
            )
        }
        buttonOpenDeclarativeCounter.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    DeclarativeCounterActivity::class.java
                )
            )
        }

        buttonOpenImperativeList.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ImperativeListActivity::class.java
                )
            )
        }
        buttonOpenDeclarativeList.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    DeclarativeListActivity::class.java
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

