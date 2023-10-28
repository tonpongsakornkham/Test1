package com.example.testsalehere.page.achievement.entity

data class AchievementItem(
    val text:String
)

fun generateMockAchievementItem(): List<AchievementItem> {
    return listOf(
        AchievementItem("item 1"),
        AchievementItem("item 2"),
        AchievementItem("item 3"),
        AchievementItem("item 4")
    )
}
