package com.example.uas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class foodadapter(private val foodList: ArrayList<datafood>)
    : RecyclerView.Adapter<foodadapter.FoodViewHolder>(){


    var onItemClick : ((datafood) -> Unit)? = null
    class FoodViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val image : ImageView = itemView.findViewById(R.id.ivfood1)
        val name : TextView = itemView.findViewById(R.id.tvfood)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_list_food , parent , false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
    // menghubungkan data dengan tampilan rv
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.image.setImageResource(food.image) //datafood
        holder.name.text = food.name //datafood

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(food)
        }
    }
}