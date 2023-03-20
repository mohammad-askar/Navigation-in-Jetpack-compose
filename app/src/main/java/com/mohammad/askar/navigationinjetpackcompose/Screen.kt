package com.mohammad.askar.navigationinjetpackcompose

const val ARG_KEY = "id"
const val ARG_KEY1 = "name"
const val HOME_ROUTE = "home_screen"
const val DETAIL_ROUTE = "detail_screen"
sealed class Screen(
    val route: String
){
    object Home: Screen("$HOME_ROUTE")
    object Detail: Screen("$DETAIL_ROUTE?$ARG_KEY={$ARG_KEY}&$ARG_KEY1={$ARG_KEY1}"){ // "detail_screen?id={id}"
        fun passName(id: Int = -1, name: String = "askar"): String {
            return "$DETAIL_ROUTE?$ARG_KEY=$id&$ARG_KEY1=$name"
        }
    }
}
