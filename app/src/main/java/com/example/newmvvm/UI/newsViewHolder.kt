package com.example.newmvvm.UI

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newmvvm.data.Article
import com.example.newmvvm.data.ResponseDTO
import kotlinx.android.synthetic.main.item_layout.view.*

class newsViewHolder(val view: View, val newsListener: NewsListener):RecyclerView.ViewHolder(view) {

   fun setdata( responseDTO: Article){
     view.apply {
         Glide.with(this).load(responseDTO.urlToImage).into(ivimage1)
         tvshortdisc.text=responseDTO.title
         tvauthor.text=responseDTO.source.name

         relate1.setOnClickListener {
             newsListener.onClick(adapterPosition,responseDTO)
         }

     }
   }
}