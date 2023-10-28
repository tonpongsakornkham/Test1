package com.example.testsalehere.page.home.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.testsalehere.databinding.ViewholderHomeHeaderBinding
import com.example.testsalehere.page.home.entity.Header

class HomeHeaderViewHolder(
    private val binding: ViewholderHomeHeaderBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(header: Header) {
        binding.apply {
            tvHomeHeader.text = header.title
        }
    }
}