package com.example.testsalehere.page.home.entity

sealed class HomeItem

data class Header(val title: String) : HomeItem()

data class Item(val listImage: List<String>) : HomeItem()

fun getMockData(): List<HomeItem> {
    return listOf(
        Header("Section 1"),
        Item(listOf("image1", "image2", "image3")),
        Header("Section 2"),
        Item(listOf("image4", "image5")),
        Header("Section 3"),
        Item(listOf("image6", "image7", "image8", "image9"))
    )
}