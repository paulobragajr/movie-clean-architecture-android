package br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.presentation.navigation.NavGraph
import br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.ui.theme.MovieCleanArchitectureAndroidTheme


//class MainActivity : ComponentActivity() {
//    private lateinit var navController: NavHostController
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MovieCleanArchitectureAndroidTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MovieCleanArchitectureAndroidTheme {
//        Greeting("Android")
//    }
//}


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

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MovieCleanArchitectureAndroidTheme {
        Greeting("Android")
    }
}