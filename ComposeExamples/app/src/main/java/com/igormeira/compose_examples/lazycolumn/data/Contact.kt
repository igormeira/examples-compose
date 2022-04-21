package com.igormeira.compose_examples.lazycolumn.data

data class Contact(
    val name: String,
    val phone: String = "+55 11 99999-9999",
    val urlImage: String? = null
)
