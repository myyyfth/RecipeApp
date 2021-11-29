package com.Kareem.myapplication.data

data class Recipes(
    var name: String,
    var category: String,
    var description: String,
    var ingridients: String,
    var instruction: String,
    val photo: String,
    var price: String,
    var calories: String,
    var carbo: String,
    var protein: String
)
