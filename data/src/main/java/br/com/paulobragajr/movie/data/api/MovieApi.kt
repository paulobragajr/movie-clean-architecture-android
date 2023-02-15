package br.com.paulobragajr.movie.data.api

import br.com.paulobragajr.movie.domain.model.MovieSeries
import br.com.paulobragajr.movie.domain.model.ResponseMovieSeries
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String,
        @Query("page") page: Int = 1,
    ): ResponseMovieSeries
}