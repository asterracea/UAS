package com.example.uas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()

        val food = intent.getParcelableExtra<datafood>("image") // parcelable untuk mengirim objek
        if (food != null) {
            val textView : TextView = findViewById(R.id.tvresep)
            val imageView : ImageView = findViewById(R.id.imageView)
            val textView2 : TextView = findViewById(R.id.detailbahan)
            val textView3 : TextView = findViewById(R.id.tvdescresep)

            // agar tampil datalist tampil pada detail
            textView.text = food.name
            imageView.setImageResource(food.image)
            textView2.setText(food.bahan)
            textView3.setText(food.resep)
        }
    }
}