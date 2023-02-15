package br.com.paulobragajr.movie.data.paging


import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import br.com.paulobragajr.movie.data.BuildConfig
import br.com.paulobragajr.movie.data.api.MovieApi
import br.com.paulobragajr.movie.domain.model.MovieSeries

//@OptIn(ExperimentalPagingApi::class)
//class MovieRemoteMediator(private val movieApi: MovieApi) :
//    RemoteMediator<Int, MovieSeries>() {
//
//    override suspend fun load(loadType: LoadType, state: PagingState<Int, MovieSeries>): MediatorResult {
////        return try {
////
////            val response = movieApi.getPopularMovies(apiKey = BuildConfig.API_KEY, page = 1)
////            var endOfPaginationReached = false
////            if (response.isSuccessful) {
////                val responseData = response.body()
////                endOfPaginationReached = responseData == null
////            }
//////            MediatorResult.Success(endOfPaginationReached = endOfPaginationReached)
////        } catch (e: Exception) {
//////            return MediatorResult.Error(e)
////        }
//    }
//}

class MovieRemoteMediator{}