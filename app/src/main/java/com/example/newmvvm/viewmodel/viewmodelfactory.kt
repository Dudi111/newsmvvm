package com.example.newmvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newmvvm.repository.mainRepo

class viewmodelfactory (val repo:mainRepo):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return mainvwmodel(repo)as T     }
}