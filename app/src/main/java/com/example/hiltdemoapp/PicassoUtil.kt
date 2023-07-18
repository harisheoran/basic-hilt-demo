package com.example.hiltdemoapp

import android.widget.ImageView
import com.squareup.picasso.Picasso
import javax.inject.Inject

class PicassoUtil @Inject constructor(private val picasso: Picasso) {
    fun loadImage(imgUrl: String, imgView: ImageView) {
        picasso.load(imgUrl).into(imgView)
    }
}