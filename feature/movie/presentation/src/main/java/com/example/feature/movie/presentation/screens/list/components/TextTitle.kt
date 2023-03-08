package com.example.feature.movie.presentation.screens.list.components

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TextTitle(name: String, action: () -> Unit = {}) {
    Text(text = name, style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.SemiBold, color = Color.White), modifier = Modifier.clickable {
        action()
    })
}