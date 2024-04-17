package com.oybekdev.movie_app.api

import com.oybekdev.movie_app.helper.Constants
import com.oybekdev.movie_app.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows():Response<TvShowResponse>
}