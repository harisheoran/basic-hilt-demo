package com.example.hiltdemoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val repository = MyRepository()

    private val _image = MutableLiveData<String>()
    val image: LiveData<String> = _image

    fun fetchImage() {
        val myImage = repository.getRandomImageUrl()
        _image.postValue(myImage)
    }
}