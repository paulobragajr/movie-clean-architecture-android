package br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.paulobragajr.movie.domain.model.MovieSeries
import br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.R

@Composable
fun MovieSeriesCard(movieSeries: MovieSeries) {
    val paddingModifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
    Card(
        elevation = 10.dp,
        modifier = paddingModifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(all = 8.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.batman),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(60.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .border(
                        BorderStroke(2.dp, Color.Black),
                        CircleShape
                    )
                    .clip(CircleShape)
            )

            Column {
                Text(movieSeries.title.toString())
                Text(movieSeries.original_title.toString())
            }
        }
    }
}

