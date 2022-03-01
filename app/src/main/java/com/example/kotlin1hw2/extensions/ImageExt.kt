package com.example.kotlin1hw2.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(url : String){
    Glide.with(this).load(url).into(this as ImageView)
}