package br.com.paulobragajr.moviecleanarchitectureandroid.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.com.paulobragajr.movie.domain.model.MovieSeries
import br.com.paulobragajr.moviecleanarchitectureandroid.ui.theme.ItemBackgroundColor

@Composable
fun MovieListContent(allMovies: ArrayList<MovieSeries>, navController: NavHostController) {

    MovieListItem(movie = MovieSeries(), navController = navController)
//    LazyColumn(
//        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
//    ) {
//        items(
//            items = allMovies
//        ) { movie ->
//            if (movie != null) {
//        MovieListItem(movie = movie, navController = navController)
//            }
//        }
//    }
}


@Composable
fun MovieListItem(movie: MovieSeries, navController: NavHostController) {
    Card(
        modifier = Modifier
            .padding(top = 8.dp)
            .height(180.dp)
            .fillMaxWidth(),
        elevation = 4.dp,
        backgroundColor = MaterialTheme.colors.ItemBackgroundColor
    ) {
        movie.title?.let { Text(text = it) }
    }
}
