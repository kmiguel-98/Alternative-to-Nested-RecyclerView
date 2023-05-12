package com.example.recyclerchallenge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerchallenge.R
import com.example.recyclerchallenge.databinding.ChipItemCellBinding

class CityRecyclerViewAdapter(private val cityList: List<String>) : RecyclerView.Adapter<CityRecyclerViewAdapter.CityRecyclerViewHolder>() {

    inner class CityRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ChipItemCellBinding.bind(itemView)

        fun configure(cityName: String) {
            binding.categoryChip.text = cityName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.chip_item_cell, parent, false)
        return CityRecyclerViewHolder(view)
    }

    override fun getItemCount() = cityList.size

    override fun onBindViewHolder(holder: CityRecyclerViewHolder, position: Int) {
        holder.configure(cityList[position])
    }
}