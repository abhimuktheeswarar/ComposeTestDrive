package com.msabhi.composedrive.mixed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import com.msabhi.composedrive.R
import com.msabhi.composedrive.routes.CounterRoute
import com.msabhi.composedrive.ui.theme.ComposeTestDriveTheme

class MixedCounterActivity : ComponentActivity() {

    private val composeView by lazy { findViewById<ComposeView>(R.id.compose_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mixed_counter)

        composeView.setContent {
            ComposeTestDriveTheme {
                Scaffold {
                    CounterRoute(modifier = Modifier.padding(it))
                }
            }
        }
    }
}

