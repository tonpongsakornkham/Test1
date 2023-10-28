package com.example.testsalehere.page.home.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testsalehere.databinding.ViewholderHomeItemBinding
import com.example.testsalehere.page.home.adapter.ItemAdapter
import com.example.testsalehere.page.home.entity.Item

class HomeItemViewHolder(
    private val binding: ViewholderHomeItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Item) {
        val itemAdapter = ItemAdapter()
        binding.rvHomeItem.apply {
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = itemAdapter
        }
        itemAdapter.submitList(item.listImage)
    }
}
