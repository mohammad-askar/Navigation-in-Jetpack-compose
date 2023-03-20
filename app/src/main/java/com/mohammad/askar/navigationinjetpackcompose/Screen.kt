package com.mohammad.askar.navigationinjetpackcompose

sealed class Screen(
    val route: String
){
    object Home: Screen("home_screen")
    object Detail: Screen("detail_screen")
}
