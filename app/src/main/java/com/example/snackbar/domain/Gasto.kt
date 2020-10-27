package com.example.snackbar.domain

data class Gasto (
    var descricao: String,
    var categoria: String,
    val dateTime: String,
    val valor: Double
)
