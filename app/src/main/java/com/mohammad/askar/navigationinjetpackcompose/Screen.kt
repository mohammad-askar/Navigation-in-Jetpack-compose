package com.mohammad.askar.navigationinjetpackcompose

const val ARG_KEY = "id"
sealed class Screen(
    val route: String
){
    object Home: Screen("home_screen")
    object Detail: Screen("detail_screen/{$ARG_KEY}"){
        fun passId(id: Int): String {
            return "detail_screen/$id"
        }
    }
}
