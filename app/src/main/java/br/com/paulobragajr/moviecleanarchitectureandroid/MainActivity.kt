package br.com.paulobragajr.moviecleanarchitectureandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.paulobragajr.moviecleanarchitectureandroid.presentation.NavGraph
import br.com.paulobragajr.moviecleanarchitectureandroid.ui.theme.MovieCleanArchitectureAndroidTheme

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
