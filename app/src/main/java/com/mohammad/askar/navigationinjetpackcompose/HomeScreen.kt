package com.mohammad.askar.navigationinjetpackcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier.fillMaxSize()
            .clickable{
                navHostController.navigate(route = Screen.Detail.route)
            },
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Home Screen",
            fontSize = 44.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )
    }
}