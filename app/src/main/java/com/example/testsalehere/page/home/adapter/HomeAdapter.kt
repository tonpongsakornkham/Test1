package com.example.testsalehere.page.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testsalehere.databinding.ViewholderHomeHeaderBinding
import com.example.testsalehere.databinding.ViewholderHomeItemBinding
import com.example.testsalehere.page.home.entity.Header
import com.example.testsalehere.page.home.entity.HomeItem
import com.example.testsalehere.page.home.entity.Item
import com.example.testsalehere.page.home.viewholder.HomeHeaderViewHolder
import com.example.testsalehere.page.home.viewholder.HomeItemViewHolder

private const val VIEW_TYPE_HEADER = 0
private const val VIEW_TYPE_ITEM = 1

class HomeAdapter() : ListAdapter<HomeItem, RecyclerView.ViewHolder>(HomeAdapterDiffCallback()) {

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is Header -> VIEW_TYPE_HEADER
            is Item -> VIEW_TYPE_ITEM
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            VIEW_TYPE_HEADER -> {
                val binding = ViewholderHomeHeaderBinding.inflate(layoutInflater, parent, false)
                HomeHeaderViewHolder(binding)
            }

            VIEW_TYPE_ITEM -> {
                val binding = ViewholderHomeItemBinding.inflate(layoutInflater, parent, false)
                HomeItemViewHolder(binding)
            }

            else -> throw IllegalArgumentException("Invalid viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is HomeHeaderViewHolder) {
            holder.bind(getItem(position) as Header)
        } else if (holder is HomeItemViewHolder) {
            holder.bind(getItem(position) as Item)
        }
    }
}

private class HomeAdapterDiffCallback : DiffUtil.ItemCallback<HomeItem>() {
    override fun areItemsTheSame(oldItem: HomeItem, newItem: HomeItem): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: HomeItem, newItem: HomeItem): Boolean {
        return oldItem == newItem
    }
}
