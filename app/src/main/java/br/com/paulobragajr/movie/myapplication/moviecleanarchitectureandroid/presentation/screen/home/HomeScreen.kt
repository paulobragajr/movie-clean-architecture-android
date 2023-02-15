package br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.presentation.screen.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import br.com.paulobragajr.movie.domain.model.MovieSeries
import br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.component.MovieSeriesCard
//, viewModel: HomeViewModel = hiltViewModel()
@Composable
fun HomeScreen(navController: NavHostController) {

//    viewModel.getMovie()
    val allMovies = arrayListOf<MovieSeries>()
    allMovies.add(MovieSeries(original_title = "teste 1", title = "teste 1"))
    allMovies.add(MovieSeries(original_title = "teste 2", title = "teste 2"))
    allMovies.add(MovieSeries(original_title = "teste 3", title = "teste 3"))
    allMovies.add(MovieSeries(original_title = "teste 4", title = "teste 4"))

    LazyColumn {
        items(allMovies) { movieSeries ->
            MovieSeriesCard(movieSeries)
        }
    }
}