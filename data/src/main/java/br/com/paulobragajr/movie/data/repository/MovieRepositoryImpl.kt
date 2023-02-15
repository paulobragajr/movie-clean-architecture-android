package br.com.paulobragajr.movie.data.repository

import br.com.paulobragajr.movie.data.repository.dataSource.MovieRemoteDataSource
import br.com.paulobragajr.movie.data.repository.dataSourceImpl.MovieRemoteDataSourceImpl
import br.com.paulobragajr.movie.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
) :
    MovieRepository {
    override suspend fun getPopularMovies() = movieRemoteDataSource.getPopularMovies()
}

//class MovieRepositoryImpl(
//    private val movieRemoteDataSource: MovieRemoteDataSource,
//    private val movieLocalDataSource: MovieLocalDataSource,
//) :
//    MovieRepository {
//    override fun getPopularMovies() =
//        movieRemoteDataSource.getPopularMovies()
//
//    override fun getMoviesFromDB(movieId: Int): Flow<Movie> =
//        movieLocalDataSource.getMoviesFromDB(movieId)
//}