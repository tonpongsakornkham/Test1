package com.example.testsalehere.page.achievement.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.testsalehere.databinding.LayoutAchievementItemBinding
import com.example.testsalehere.page.achievement.entity.AchievementItem
import com.example.testsalehere.page.achievement.viewholder.AchievementItemViewHolder

class AchievementItemAdapter() : ListAdapter<AchievementItem, AchievementItemViewHolder>(AchievementItemAdapterDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementItemViewHolder {
        val binding = LayoutAchievementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AchievementItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AchievementItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

private class AchievementItemAdapterDiffCallback : DiffUtil.ItemCallback<AchievementItem>() {
    override fun areItemsTheSame(oldItem: AchievementItem, newItem: AchievementItem): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: AchievementItem, newItem: AchievementItem): Boolean {
        return oldItem == newItem
    }
}
