package com.mohammad.askar.navigationinjetpackcompose

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){

        composable(
            route = Screen.Home.route,
        ){

            HomeScreen(navHostController = navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(
                name = ARG_KEY
            ){
                type = NavType.IntType
                defaultValue = -1
            },
            navArgument(name = ARG_KEY1){
                type = NavType.StringType
                defaultValue = "Askar"
            })

        ){
            Log.d("myTag", it.arguments?.getInt(ARG_KEY).toString())
            Log.d("myTag", it.arguments?.getString(ARG_KEY1).toString())
            DetailScreen(navHostController = navController)
        }
    }
}