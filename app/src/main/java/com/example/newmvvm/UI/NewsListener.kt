package com.example.newmvvm.UI

import com.example.newmvvm.data.Article

interface NewsListener {

    fun onClick(position:Int, article: Article)
}