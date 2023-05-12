package com.example.recyclerchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerchallenge.databinding.ActivityMainBinding
import com.example.recyclerchallenge.models.Category
import com.example.recyclerchallenge.models.City
import com.example.recyclerchallenge.provider.ItemsProviderImpl
import com.example.recyclerchallenge.ui.CategoryRecyclerViewAdapter
import com.example.recyclerchallenge.ui.CityRecyclerViewAdapter
import com.example.recyclerchallenge.ui.ItemRecyclerViewAdapter

class MainActivity : AppCompatActivity() {

    private val itemList = ItemsProviderImpl.getAllItems()
    private val categoryList = Category.allValues()
    private val cityList = City.allValues()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val categoryAdapter = CategoryRecyclerViewAdapter(categoryList)
        binding.categoryRecyclerview.adapter = categoryAdapter

        val cityAdapter = CityRecyclerViewAdapter(cityList)
        binding.cityRecyclerview.adapter = cityAdapter

        val itemAdapter = ItemRecyclerViewAdapter(itemList)
        binding.itemsRecyclerview.adapter = itemAdapter
    }
}