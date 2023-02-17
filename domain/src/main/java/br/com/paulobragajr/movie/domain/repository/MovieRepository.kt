package br.com.paulobragajr.movie.domain.repository

import br.com.paulobragajr.movie.domain.model.ResponseMovieSeries
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun getPopularMovies(): Flow<ResponseMovieSeries>
}