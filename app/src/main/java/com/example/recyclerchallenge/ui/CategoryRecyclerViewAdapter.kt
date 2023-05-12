package com.example.recyclerchallenge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerchallenge.R
import com.example.recyclerchallenge.databinding.ChipItemCellBinding

class CategoryRecyclerViewAdapter(private val categoryList: List<String>) :
    RecyclerView.Adapter<CategoryRecyclerViewAdapter.CategoryRecyclerViewHolder>() {

    inner class CategoryRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ChipItemCellBinding.bind(itemView)

        fun configure(categoryTitle: String) {
            binding.categoryChip.text = categoryTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.chip_item_cell, parent, false)
        return CategoryRecyclerViewHolder(view)
    }

    override fun getItemCount() = categoryList.size

    override fun onBindViewHolder(holder: CategoryRecyclerViewHolder, position: Int) {
        holder.configure(categoryList[position])
    }
}