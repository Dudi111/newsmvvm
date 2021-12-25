package com.example.newmvvm.remote

import com.example.newmvvm.data.Article
import com.example.newmvvm.data.ResponseDTO
import retrofit2.http.GET

interface ApiService {

    @GET("v2/everything?q=keyword&apiKey=480166648b5a441eb890253626e776cb")
    suspend fun getapi():ResponseDTO
}