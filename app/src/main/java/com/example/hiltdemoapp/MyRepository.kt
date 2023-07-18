package com.example.hiltdemoapp

class MyRepository {
    private val service = MyService()

    fun getRandomImageUrl(): String {
        return service.getImageUrl()
    }
}