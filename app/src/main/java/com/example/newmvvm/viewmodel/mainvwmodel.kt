package com.example.newmvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newmvvm.data.Article
import com.example.newmvvm.repository.mainRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class mainvwmodel (val repo:mainRepo):ViewModel() {

    private var mutableLiveData=MutableLiveData<List<Article>>()
    val liveData:LiveData<List<Article>> = mutableLiveData

    fun callapi(){
        CoroutineScope(Dispatchers.IO).launch {
           val data= repo.getapiresp()
            mutableLiveData.postValue(data)
            Log.d("dudi", "postvalue done ")
        }
    }
}