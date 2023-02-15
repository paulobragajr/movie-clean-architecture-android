package br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.presentation.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.paulobragajr.movie.domain.usecase.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    movieUseCases: MovieUseCases,
) : ViewModel() {
    val usecase = movieUseCases

    fun getMovie(){
        viewModelScope.launch {
            usecase.getPopularMoviesUseCase().collect{ responseMovieSerie ->
                println("Teste")
                println(responseMovieSerie)
            }
        }
    }
}