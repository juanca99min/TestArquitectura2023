package com.example.feature.movie.presentation.screens.list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.feature.movie.presentation.ui.theme.Green

@Composable
fun Categories() {
    val listCategories = listOf(
        "All", "Action", "Adventure", "Comedy", "Cooking", "Drama","Adventure", "Comedy", "Cooking", "Drama",
    )
    Box(modifier = Modifier.padding(vertical = 10.dp, horizontal = 16.dp)) {
        LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            items(listCategories){
                Column(modifier = Modifier.width(IntrinsicSize.Max)) {
                    Text(text = it, style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold, fontSize = 14.sp))
                    Spacer(modifier = Modifier.height(3.dp))
                    if (it == "All") {
                        Box(modifier = Modifier
                            .background(Green)
                            .height(3.dp)
                            .fillMaxWidth())
                    }
                }
            }
        }
    }
}