package com.example.feature.movie.presentation.screens.list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.feature.movie.presentation.R
import com.example.feature.movie.presentation.ui.theme.Green

@Composable
fun ItemPlayingNow(navController: NavController) {
    Box(
        modifier = Modifier
            .width(130.dp)
            .height(200.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Black)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.avengers),
                contentDescription = "avengers",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                contentScale = ContentScale.Crop

            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(Green)
                    .padding(horizontal = 10.dp, vertical = 5.dp)
            ) {
                Column() {
                    Text(
                        text = "Avengers End Game asdasdasd",
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 12.sp, color = Color.Black),
                        maxLines = 1

                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "English", style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 10.sp, color = Color.Black), modifier = Modifier.weight(1f), overflow = TextOverflow.Ellipsis)
                        Text(text = "10564 views", style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 10.sp, color = Color.Black), modifier = Modifier.weight(1f), overflow = TextOverflow.Ellipsis)
                    }
                }
            }
        }
    }
}