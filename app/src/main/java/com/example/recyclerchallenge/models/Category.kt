package com.example.recyclerchallenge.models

enum class Category(val value: String) {
    Todos("Todos"),
    CategoryOne("categoryOne"),
    CategoryTwo("categoryTwo"),
    CategoryThree("categoryThree"),
    CategoryFour("categoryFour"),
    CategoryFive("categoryFive");

    companion object {

        fun allValues() = values().map { it.value }

        fun fromValue(value: String) = values().find { it.value == value } ?: Todos
    }
}