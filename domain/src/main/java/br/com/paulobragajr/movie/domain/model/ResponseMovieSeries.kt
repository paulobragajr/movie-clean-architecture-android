package br.com.paulobragajr.movie.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseMovieSeries (var page: Int,
                                var total_results: Int,
                                var total_pages: Int,
                                var results: List<MovieSeries>) : Parcelable