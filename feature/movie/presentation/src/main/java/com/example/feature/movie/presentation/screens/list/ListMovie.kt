package com.example.feature.movie.presentation.screens.list

import android.content.res.Configuration
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.feature.movie.presentation.R
import com.example.feature.movie.presentation.screens.list.components.*

@Composable
fun MovieListScreen(navController: NavController) {
    Scaffold(
        topBar = {
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 10.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Image(imageVector = ImageVector.vectorResource(id = R.drawable.menu), contentDescription = "Menu", modifier = Modifier.clickable {  })
                    Image(painter = painterResource(id = R.drawable.logo_2), contentDescription = "Menu", modifier = Modifier.width(150.dp))
                    Image(imageVector = ImageVector.vectorResource(id = R.drawable.search), contentDescription = "arrow", modifier = Modifier.clickable {  })
                }
            }
        }
    ) { padding ->
        LazyVerticalGrid(columns = GridCells.Fixed(2), ) {
            item(span = { GridItemSpan(2) }) { Categories()}
            item(span = { GridItemSpan(2) }) { TitlePlayingNow()}
            item(span = { GridItemSpan(2) }) { PlayingNow(navController, padding ) }
            item(span = { GridItemSpan(2) }) { TitlePopularMovies()}
            items(13) { ItemPopularMovie()}

        }

    }
}

@Preview()
@Composable
fun PreviewMovieListScreen() {
    MovieListScreen(navController = rememberNavController())
}