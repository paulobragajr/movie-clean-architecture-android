package br.com.paulobragajr.movie.data.repository.dataSourceImpl

import br.com.paulobragajr.movie.data.BuildConfig
import br.com.paulobragajr.movie.data.api.MovieApi
import br.com.paulobragajr.movie.data.repository.dataSource.MovieRemoteDataSource
import br.com.paulobragajr.movie.domain.model.ResponseMovieSeries
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MovieRemoteDataSourceImpl(private val movieApi: MovieApi) : MovieRemoteDataSource {


//    fun getUsers() = flow {
//        emit(movieApi.getPopularMovies(apiKey = BuildConfig.API_KEY, page = 1))
//    }

    override suspend fun getPopularMovies(): Flow<ResponseMovieSeries> {
        return flow{
            movieApi.getPopularMovies(apiKey = BuildConfig.API_KEY, page = 1)
        }
    }

}