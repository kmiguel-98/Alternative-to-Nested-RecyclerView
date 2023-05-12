package com.example.recyclerchallenge.models

enum class City(val value: String) {
    Todos("Todos"),
    Managua("Managua"),
    Esteli("Estelí"),
    Leon("León");

    companion object {

        fun allValues() = values().map { it.value }

        fun fromValue(value: String) = values().find { it.value == value } ?: Todos
    }
}