package com.example.newmvvm.repository

import android.util.Log
import com.example.newmvvm.data.Article
import com.example.newmvvm.remote.network

class mainRepo () {

    suspend fun getapiresp():List<Article>{
        Log.d("dudi", "repo working ")
        return network.getapiservice().getapi().articles

    }


}