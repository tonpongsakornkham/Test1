package com.example.testsalehere.page.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testsalehere.R
import com.example.testsalehere.databinding.FragmentHomeBinding
import com.example.testsalehere.extension.viewBinding
import com.example.testsalehere.page.home.adapter.HomeAdapter
import com.example.testsalehere.page.home.adapter.TopItemAdapter
import com.example.testsalehere.page.home.entity.generateMockTopItemData
import com.example.testsalehere.page.home.entity.getMockData

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val viewModel: HomeViewModel by activityViewModels()

    private val homeAdapter: HomeAdapter by lazy { HomeAdapter() }
    private val topItemAdapter: TopItemAdapter by lazy { TopItemAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()

        homeAdapter.submitList(getMockData())
        topItemAdapter.submitList(generateMockTopItemData())
    }

    private fun setUpView() {
        binding.apply {
            rvHome.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(requireContext())
                adapter = homeAdapter
            }

            rvTopItem.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = topItemAdapter
            }
        }
    }
}
