package com.example.newmvvm.data

data class ResponseDTO(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)