package com.example.testsalehere.page.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.testsalehere.R
import com.example.testsalehere.databinding.FragmentProfileBinding
import com.example.testsalehere.extension.viewBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val binding by viewBinding(FragmentProfileBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTitle.text = "Profile"
    }
}
