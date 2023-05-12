package com.example.recyclerchallenge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerchallenge.R
import com.example.recyclerchallenge.databinding.ItemCellBinding
import com.example.recyclerchallenge.models.Item

class ItemRecyclerViewAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<ItemRecyclerViewAdapter.ItemRecyclerViewHolder>() {

    inner class ItemRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemCellBinding.bind(itemView)

        fun configure(item: Item) {
            if (item.image.isBlank()) binding.itemImageImageview.setImageResource(R.drawable.image_placeholder)
            binding.itemNameTextview.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cell, parent, false)
        return ItemRecyclerViewHolder(view)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: ItemRecyclerViewHolder, position: Int) {
        holder.configure(itemList[position])
    }
}