package com.example.recyclerchallenge.models

data class Item(
    val id: String,
    val name: String,
    val image: String,
    val categories: List<Category>,
    val city: City
)
