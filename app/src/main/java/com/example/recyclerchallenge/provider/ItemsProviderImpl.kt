package com.example.recyclerchallenge.provider

import com.example.recyclerchallenge.models.Category
import com.example.recyclerchallenge.models.City
import com.example.recyclerchallenge.models.Item

class ItemsProviderImpl {

    companion object {

        fun getAllItems(): List<Item> = (0..25).map {
            Item(
                id = "$it",
                name = "Item#$it",
                image = "",
                categories = listOf(
                    Category.CategoryOne,
                    Category.CategoryFive,
                    Category.CategoryThree
                ),
                city = City.Esteli
            )
        }
    }
}