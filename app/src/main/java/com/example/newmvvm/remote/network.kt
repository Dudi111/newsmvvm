package com.example.newmvvm.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object network {

        val httploggingintercepter=HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    private fun getretrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl( "https://newsapi.org/").addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(httploggingintercepter).build()).build()
    }
    fun getapiservice()= getretrofit().create(ApiService::class.java)
}