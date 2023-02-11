package br.com.paulobragajr.movie.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieSeries (val adult: Boolean?=false,
                        val video: Boolean?=false,
                        val id: Int?=0,
                        val vote_count: Int=0,
                        val vote_average: Double=0.0,
                        val popularity: Double?=0.0,
                        val backdrop_path: String? = "",
                        val original_language: String? = "",
                        val original_title: String? = "",
                        val overview: String? = "",
                        val release_date: String? = "",
                        val genres: String? = "",
                        val poster_path: String? = "",
                        val title: String? = "",
                        val tagline:String? = ""): Parcelable