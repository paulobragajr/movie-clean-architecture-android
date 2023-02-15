package br.com.paulobragajr.movie.data.repository.dataSource

import br.com.paulobragajr.movie.domain.model.ResponseMovieSeries
import kotlinx.coroutines.flow.Flow

interface MovieRemoteDataSource {
    suspend fun getPopularMovies(): Flow<ResponseMovieSeries>
}