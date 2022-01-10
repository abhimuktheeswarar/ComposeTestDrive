package com.msabhi.composedrive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.msabhi.composedrive.ui.ComposeTestDriveApp

class RootActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestDriveApp { finish() }
        }
    }
}

