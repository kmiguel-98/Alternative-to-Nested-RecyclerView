package com.example.recyclerchallenge.provider

import com.example.recyclerchallenge.models.Item

interface ItemsProvider {

    fun getAllItems(): List<Item>
}