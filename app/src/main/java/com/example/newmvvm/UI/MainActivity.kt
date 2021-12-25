package com.example.newmvvm.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newmvvm.R
import com.example.newmvvm.data.Article
import com.example.newmvvm.repository.mainRepo
import com.example.newmvvm.viewmodel.mainvwmodel
import com.example.newmvvm.viewmodel.viewmodelfactory
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),NewsListener {

   lateinit var reposit:mainRepo
    lateinit var factory:viewmodelfactory
    lateinit var  viewModel:mainvwmodel
    var newsdata=ArrayList<Article>()
    lateinit var newsadapter:newsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       reposit= mainRepo()
        factory=viewmodelfactory(reposit)
        viewModel= ViewModelProviders.of(this,factory).get(mainvwmodel::class.java)
        setadapter()
        viewModel.callapi()

        viewModel.liveData.observe(this, Observer {
            newsdata=it as ArrayList<Article>
            Log.d("dudi", "onCreate:${newsdata[0].author} ")
            setadapter()
        })


    }

    fun setadapter(){
       newsadapter=newsAdapter(this,newsdata,this)
        val linearLayoutManager=LinearLayoutManager(this)
     recycle.adapter= newsadapter
        recycle.layoutManager=linearLayoutManager
    }

    override fun onClick(position: Int, article: Article) {
       val intent=Intent(this,detailActivity::class.java)
        intent.putExtra("image",article.urlToImage)
        intent.putExtra("title",article.title)
        intent.putExtra("name",article.source.name)
        intent.putExtra("disc",article.description)
        startActivity(intent)

    }
}