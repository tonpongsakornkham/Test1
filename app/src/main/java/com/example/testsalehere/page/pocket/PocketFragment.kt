package com.example.testsalehere.page.pocket

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.testsalehere.R
import com.example.testsalehere.databinding.FragmentPocketBinding
import com.example.testsalehere.extension.viewBinding

class PocketFragment : Fragment(R.layout.fragment_pocket) {

    private val binding by viewBinding(FragmentPocketBinding::bind)
    private val viewModel : PocketViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachObserve()
    }

    private fun attachObserve() {
        viewModel.apply {
            setTitle.observe(viewLifecycleOwner) {
                binding.tvTitle.text = it
            }
        }
    }
}
