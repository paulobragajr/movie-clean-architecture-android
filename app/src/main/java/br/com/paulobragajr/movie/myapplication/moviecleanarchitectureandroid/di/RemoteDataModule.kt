package br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.di

import br.com.paulobragajr.movie.data.api.MovieApi
import br.com.paulobragajr.movie.data.repository.dataSource.MovieRemoteDataSource
import br.com.paulobragajr.movie.data.repository.dataSourceImpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {
    @Provides
    fun provideMoviesRemoteDataSource(movieApi: MovieApi) : MovieRemoteDataSource =
        MovieRemoteDataSourceImpl(movieApi)
}