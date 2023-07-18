package com.example.hiltdemoapp

import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object PicassoModule {
    @Provides
    fun providePicasso(): Picasso {
        return Picasso.get()
    }
}