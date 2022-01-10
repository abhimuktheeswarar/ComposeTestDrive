package com.msabhi.composedrive.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.msabhi.composedrive.routes.CounterRoute
import com.msabhi.composedrive.routes.HomeRoute
import com.msabhi.composedrive.ui.theme.ComposeTestDriveTheme

/**
 * Created by Abhi Muktheeswarar on 10-January-2022
 */

@Composable
fun ComposeTestDriveApp(finishActivity: () -> Unit) {

    val scaffoldState = rememberScaffoldState()

    ComposeTestDriveTheme {
        Scaffold(scaffoldState = scaffoldState) { innerPaddingModifier ->
            NavigationGraph(
                modifier = Modifier.padding(innerPaddingModifier),
                scaffoldState = scaffoldState,
                finishActivity = finishActivity
            )
        }
    }
}

@Composable
fun NavigationGraph(
    modifier: Modifier,
    scaffoldState: ScaffoldState,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "HOME",
    finishActivity: () -> Unit
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {

        composable("HOME") {
            BackHandler {
                finishActivity()
            }

            HomeRoute(navigateToCounter = { navController.navigate("COUNTER") })
        }

        composable("COUNTER") {
            CounterRoute()
        }
    }
}