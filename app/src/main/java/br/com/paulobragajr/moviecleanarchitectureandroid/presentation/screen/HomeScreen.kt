package br.com.paulobragajr.moviecleanarchitectureandroid.presentation.screen

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
//import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import br.com.paulobragajr.movie.domain.model.MovieSeries
import br.com.paulobragajr.moviecleanarchitectureandroid.ui.theme.AppContentColor
import br.com.paulobragajr.moviecleanarchitectureandroid.ui.theme.AppThemeColor


@Composable
fun HomeScreen(navController: NavHostController) {

//    val systemUiController = rememberSystemUiController()
//    val systemBarColor = MaterialTheme.colors.AppThemeColor
//    val allMovies = viewModel.getAllPopularMovies.collectAsLazyPagingItems()
    val allMovies = arrayListOf<MovieSeries>()

//    SideEffect {
//        systemUiController.setStatusBarColor(
//            color = systemBarColor
//        )
//    }

    Scaffold(
        backgroundColor = MaterialTheme.colors.AppThemeColor,
        contentColor = MaterialTheme.colors.AppContentColor,
        topBar = {
//            HomeTopBar()
        },
        content = {
            Text("testi")
            MovieListContent(allMovies = allMovies, navController = navController)
        }
    )
}
