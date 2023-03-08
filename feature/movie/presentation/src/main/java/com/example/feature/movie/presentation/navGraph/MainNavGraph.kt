package com.example.feature.movie.presentation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.feature.movie.presentation.screens.list.MovieListScreen
import com.example.feature.movie.presentation.util.Screen

@Composable
fun MainNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.List.route) {
        composable(Screen.List.route) {
            MovieListScreen(navController)
        }
        composable(Screen.Detail.route) {

        }
    }
}