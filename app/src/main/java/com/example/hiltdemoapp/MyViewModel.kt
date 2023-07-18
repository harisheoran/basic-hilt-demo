package com.example.hiltdemoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val repository: MyRepository) : ViewModel() {

    private val _image = MutableLiveData<String>()
    val image: LiveData<String> = _image

    fun fetchImage() {
        val myImage = repository.getRandomImageUrl()
        _image.postValue(myImage)
    }
}