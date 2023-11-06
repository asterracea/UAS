package com.example.uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    // lateinit
    private lateinit var recyclerView: RecyclerView  //menampilkan list item dalam daftar gulir
    private lateinit var foodList: ArrayList<datafood>
    private lateinit var foodadapter: foodadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // menghapus action bar atas
        supportActionBar?.hide()

        recyclerView = findViewById(R.id.rv)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2) //mengatur rv secara vertikal

        foodList = ArrayList()
        foodList.add(datafood(R.drawable.cireng ,"Cireng", R.string.BahanCireng, R.string.CirengDesc))
        foodList.add(datafood(R.drawable.tahu , "Tahu Bakso", R.string.BahanTahu, R.string.TahuDesc ))
        foodList.add(datafood(R.drawable.omelette , "Omelette", R.string.BahanOmelette, R.string.OmeletteDesc ))
        foodList.add(datafood(R.drawable.pancake ,"Pancake", R.string.BahanPancake, R.string.PancakeDesc ))
        foodList.add(datafood(R.drawable.capcay ,"Capcay", R.string.BahanCapcay, R.string.CapcayDesc ))
        foodList.add(datafood(R.drawable.kangkung ,"Tumis Kangkung", R.string.BahanKangkung, R.string.KangkungDesc ))
        foodList.add(datafood(R.drawable.sop ,"Sayur Sop", R.string.BahanSop, R.string.SopDesc))
        foodList.add(datafood(R.drawable.orek ,"Orek Tempe", R.string.BahanOrek, R.string.OrekDesc ))
        foodList.add(datafood(R.drawable.nasgor ,"Nasi Goreng", R.string.BahanNasgor, R.string.NasgorDesc ))
        foodList.add(datafood(R.drawable.ayam ,"Ayam Ungkep", R.string.BahanAyam, R.string.AyamDesc ))
        foodList.add(datafood(R.drawable.bihun, "Bihun Goreng",R.string.BahanBihun, R.string.BihunDesc))
        foodList.add(datafood(R.drawable.jamur, "Oseng Jamur",R.string.BahanJamur, R.string.JamurDesc))
        foodList.add(datafood(R.drawable.pakcoy, "Pakcoy chinese",R.string.BahanPakcoy, R.string.PakcoyDesc))

        foodadapter = foodadapter(foodList)
        recyclerView.adapter = foodadapter  //mengatur foodadapter sebagai adapter dri rv

        // agar ketika di klik pada rv akan memulai aktivitas detail
        foodadapter.onItemClick ={
            val intent = Intent(this, detail::class.java)
            intent.putExtra("image", it)
            startActivity(intent)}
    }
}