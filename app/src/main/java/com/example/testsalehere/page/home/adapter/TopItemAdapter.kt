package com.example.testsalehere.page.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.testsalehere.databinding.LayoutCardTopItemBinding
import com.example.testsalehere.page.home.entity.TopItem
import com.example.testsalehere.page.home.viewholder.TopItemViewHolder

class TopItemAdapter() : ListAdapter<TopItem, TopItemViewHolder>(TopItemAdapterDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopItemViewHolder {
        val binding = LayoutCardTopItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TopItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TopItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

private class TopItemAdapterDiffCallback : DiffUtil.ItemCallback<TopItem>() {
    override fun areItemsTheSame(oldItem: TopItem, newItem: TopItem): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: TopItem, newItem: TopItem): Boolean {
        return oldItem == newItem
    }
}
