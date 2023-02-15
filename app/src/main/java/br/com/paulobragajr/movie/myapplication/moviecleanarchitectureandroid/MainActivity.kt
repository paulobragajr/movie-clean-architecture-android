package br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.presentation.navigation.NavGraph
import br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.ui.theme.MovieCleanArchitectureAndroidTheme
import dagger.hilt.android.AndroidEntryPoint

//@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieCleanArchitectureAndroidTheme {
                navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}
