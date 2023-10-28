package com.example.testsalehere.page.home.entity

data class TopItem(
    val text: String
)

fun generateMockTopItemData(): List<TopItem> {
    return listOf(
        TopItem("item 1"),
        TopItem("item 2"),
        TopItem("item 3"),
        TopItem("item 4")
    )
}
