package br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.di

import br.com.paulobragajr.movie.data.repository.MovieRepositoryImpl
import br.com.paulobragajr.movie.data.repository.dataSource.MovieRemoteDataSource
import br.com.paulobragajr.movie.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideMoviesRepository(
        movieRemoteDataSource: MovieRemoteDataSource
    ): MovieRepository =
        MovieRepositoryImpl(movieRemoteDataSource)
}