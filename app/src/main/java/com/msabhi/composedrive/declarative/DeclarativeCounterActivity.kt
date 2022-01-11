package com.msabhi.composedrive.declarative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material.icons.sharp.Remove
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.msabhi.composedrive.ui.theme.ComposeTestDriveTheme

/**
 * Created by Abhi Muktheeswarar on 11-January-2022
 */

class DeclarativeCounterActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestDriveTheme {
                Scaffold {
                    Counter(Modifier.padding(it))
                }
            }
        }
    }
}

@Composable
fun Counter(modifier: Modifier = Modifier) {

    var count by remember {
        mutableStateOf(0)
    }

    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {

        Button(onClick = { count-- }) {
            Icon(Icons.Sharp.Remove, contentDescription = "Decrease")
            Text(text = "DECREASE")
        }
        Text(text = count.toString(), style = MaterialTheme.typography.h6)
        Button(onClick = { count++ }) {
            Icon(Icons.Sharp.Add, contentDescription = "Increase")
            Text(text = "INCREASE")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    ComposeTestDriveTheme {
        Counter()
    }
}