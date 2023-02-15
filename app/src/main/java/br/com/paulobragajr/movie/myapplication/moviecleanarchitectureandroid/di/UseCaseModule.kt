package br.com.paulobragajr.movie.myapplication.moviecleanarchitectureandroid.di

import br.com.paulobragajr.movie.domain.repository.MovieRepository
import br.com.paulobragajr.movie.domain.usecase.GetPopularMoviesUseCase
import br.com.paulobragajr.movie.domain.usecase.MovieUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideMovieUseCases(movieRepository: MovieRepository) = MovieUseCases(
        getPopularMoviesUseCase = GetPopularMoviesUseCase(movieRepository = movieRepository)
    )
}