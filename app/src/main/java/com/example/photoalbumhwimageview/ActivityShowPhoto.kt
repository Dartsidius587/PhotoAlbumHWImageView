package com.example.photoalbumhwimageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ActivityShowPhoto : AppCompatActivity() {

    private var countPhoto = 1

    private lateinit var showPhotoIV: ImageView
    private lateinit var nextPhotoBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()

        nextPhotoBTN.setOnClickListener {

            countPhoto++
            showPhotoIV.setImageResource(ShowPhoto().showPhoto(countPhoto))

            if (ShowPhoto().showPhoto(countPhoto) == 0) {
                val intent = Intent(this, ActivityFinish::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun init() {
        setContentView(R.layout.activity_show_photo)
        showPhotoIV = findViewById(R.id.showPhotoIV)
        nextPhotoBTN = findViewById(R.id.nextPhotoBTN)
    }
}