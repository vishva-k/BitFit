package com.example.bitfit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NutritionAdapter(private val context: Context, private val nutrition:List<Nutrition>) : RecyclerView.Adapter<NutritionAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.nutrition_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nutrition = nutrition[position]
        holder.bind(nutrition)
    }

    override fun getItemCount(): Int {
        return nutrition.size
    }

    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        private val foodTV : TextView = itemView.findViewById(R.id.nutritionNameTV)
        private val calorieCount : TextView = itemView.findViewById(R.id.calorieCountTV)
        init
        {
            itemView.setOnClickListener(this)
        }

        fun bind(nutrition: Nutrition)
        {
            foodTV.text = nutrition.nutritionName
            calorieCount.text = nutrition.calorieCount
        }

        override fun onClick(p0: View?) {
            // No operation
        }
    }
}