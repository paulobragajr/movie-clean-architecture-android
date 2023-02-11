package br.com.paulobragajr.movie.domain.repository

import androidx.paging.PagingData
import br.com.paulobragajr.movie.domain.model.MovieSeries
import kotlinx.coroutines.flow.Flow


interface MovieRepository {
    fun getPopularMovies(): Flow<PagingData<MovieSeries>>
}