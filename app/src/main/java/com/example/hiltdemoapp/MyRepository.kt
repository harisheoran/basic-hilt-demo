package com.example.hiltdemoapp

import javax.inject.Inject

class MyRepository @Inject constructor(private val service: MyService) {

    fun getRandomImageUrl(): String {
        return service.getImageUrl()
    }
}