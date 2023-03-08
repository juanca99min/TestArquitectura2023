package com.example.feature.movie.presentation.screens.list.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun PlayingNow(navController : NavController, padding: PaddingValues) {
    LazyRow(modifier = Modifier.padding(padding), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        item { Spacer(modifier = Modifier.width(10.dp)) }
        items(10) {
            ItemPlayingNow(navController)
        }
    }
}