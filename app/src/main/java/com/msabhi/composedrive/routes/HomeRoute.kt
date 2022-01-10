package com.msabhi.composedrive.routes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msabhi.composedrive.ui.theme.ComposeTestDriveTheme

/**
 * Created by Abhi Muktheeswarar on 10-January-2022
 */

@Composable
fun HomeRoute(modifier: Modifier = Modifier, navigateToCounter: () -> Unit) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp), contentAlignment = Alignment.Center
    ) {

        Button(onClick = navigateToCounter) {
            Text(text = "OPEN COUNTER")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeRoutePreview() {
    ComposeTestDriveTheme {
        HomeRoute {}
    }
}