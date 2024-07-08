package com.example.photoalbumhwimageview

class ShowPhoto {

    fun showPhoto(countPhoto: Int) = when (countPhoto) {
        1 -> R.drawable.images
        2 -> R.drawable.priroda
        3 -> R.drawable.priroda1
        4 -> R.drawable.priroda2
        5 -> R.drawable.priroda_reka
        else -> 0
    }
}