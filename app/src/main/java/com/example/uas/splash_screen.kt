package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        // menghilangkan action bar
        supportActionBar?.hide()

        // untuk menunda eksekusi kode selama 3 dtk lalu setelah itu kode dalam {} akan dieksekusi
        Handler().postDelayed({
            // variabel untuk menyimpan nilai intent yang memulai MainActivity.kt
            val intent = Intent(this, MainActivity::class.java)
            // untuk memulai activity dari variabel intent yang telah dibuat
            startActivity(intent)
            finish()
        }, 3000)    //waktu splash ditampilkan
    }
}