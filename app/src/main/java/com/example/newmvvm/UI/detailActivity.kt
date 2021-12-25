package com.example.newmvvm.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.newmvvm.R
import kotlinx.android.synthetic.main.activity_detail.*

class detailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

         Glide.with(imgdetail).load(intent.getStringExtra("image")).into(imgdetail)
        tvtitle2.text=intent.getStringExtra("title")
        tvtitle3.text=intent.getStringExtra("name")
        tvdisc.text=intent.getStringExtra("disc")
    }
}