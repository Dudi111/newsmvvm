package com.example.newmvvm.UI

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newmvvm.R
import com.example.newmvvm.data.Article
import com.example.newmvvm.data.ResponseDTO

class newsAdapter(private val context: Context,private var newslist:ArrayList<Article>, val newsListener: NewsListener):RecyclerView.Adapter<newsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): newsViewHolder {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return newsViewHolder(view,newsListener)
    }

    override fun onBindViewHolder(holder: newsViewHolder, position: Int) {
    val model=newslist[position]
    holder.setdata(model)
    }

    override fun getItemCount(): Int {
        return newslist.size
    }
}