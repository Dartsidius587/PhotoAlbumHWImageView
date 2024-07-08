package com.example.photoalbumhwimageview

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class ActivityFinish : AppCompatActivity() {

    private lateinit var finishTitleTB: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        setContentView(R.layout.activity_finish)
        finishTitleTB = findViewById(R.id.finishTitleTB)
        setSupportActionBar(finishTitleTB)
        title = "Спасибо за просмотр!"
        finishTitleTB.subtitle = "До свидания."
        finishTitleTB.setTitleTextColor(Color.YELLOW)
        finishTitleTB.setSubtitleTextColor(Color.parseColor("#FF7B068F"))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_finish, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menuExit) finish()
        return super.onOptionsItemSelected(item)
    }
}