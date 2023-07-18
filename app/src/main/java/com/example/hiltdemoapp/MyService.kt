package com.example.hiltdemoapp

import javax.inject.Inject

class MyService @Inject constructor() {
    private val imageUrls = listOf(
        "https://cdn.pixabay.com/photo/2023/06/26/04/37/ai-generated-8088679_960_720.jpg",
        "https://cdn.pixabay.com/photo/2023/07/15/01/50/student-8127943_960_720.jpg",
        "https://cdn.pixabay.com/photo/2023/02/17/19/05/ai-generated-7796719_960_720.jpg",
        "https://cdn.pixabay.com/photo/2023/05/07/10/45/ai-generated-7976140_960_720.jpg",
        "https://cdn.pixabay.com/photo/2023/06/15/07/24/ai-generated-8064706_960_720.jpg"
    )

    fun getImageUrl(): String {
        return imageUrls.random()
    }
}