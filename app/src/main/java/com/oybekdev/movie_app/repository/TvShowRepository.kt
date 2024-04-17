package com.oybekdev.movie_app.repository

import com.oybekdev.movie_app.api.ApiService
import javax.inject.Inject

class TvShowRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getTvShows() = apiService.getTvShows()
}