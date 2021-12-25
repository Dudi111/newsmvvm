package com.example.newmvvm.repository

import android.util.Log
import com.example.newmvvm.data.Article
import com.example.newmvvm.remote.network
import javax.inject.Inject

class mainRepo @Inject constructor() {

    suspend fun getapiresp():List<Article>{
        Log.d("dudi", "repo working ")
        return network.getapiservice().getapi().articles

    }


}