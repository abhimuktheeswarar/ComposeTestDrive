package com.msabhi.composedrive.mixed

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material.icons.sharp.Remove
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AbstractComposeView
import com.msabhi.composedrive.ui.theme.ComposeTestDriveTheme

/**
 * Created by Abhi Muktheeswarar on 10-January-2022
 */

class CounterView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    private var count = mutableStateOf(0)

    fun increase() {
        count.value = count.value + 1
    }

    fun decrease() {
        count.value = count.value - 1
    }

    @Composable
    override fun Content() {
        ComposeTestDriveTheme {
            Scaffold { innerPaddingModifier ->
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPaddingModifier),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    Button(onClick = { decrease() }) {
                        Icon(Icons.Sharp.Remove, contentDescription = "Decrease")
                        Text(text = "DECREASE")
                    }
                    Text(text = count.value.toString(), style = MaterialTheme.typography.h6)
                    Button(onClick = { increase() }) {
                        Icon(Icons.Sharp.Add, contentDescription = "Increase")
                        Text(text = "INCREASE")
                    }
                }
            }
        }

    }
}

