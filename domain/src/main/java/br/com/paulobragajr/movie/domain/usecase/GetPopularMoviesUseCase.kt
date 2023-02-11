package br.com.paulobragajr.movie.domain.usecase

import br.com.paulobragajr.movie.domain.repository.MovieRepository

class GetPopularMoviesUseCase(private val movieRepository: MovieRepository) {
    operator fun invoke() = movieRepository.getPopularMovies()
}