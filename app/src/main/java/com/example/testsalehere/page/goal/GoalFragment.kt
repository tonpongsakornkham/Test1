package com.example.testsalehere.page.goal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.testsalehere.R
import com.example.testsalehere.databinding.FragmentGoalBinding
import com.example.testsalehere.extension.viewBinding

class GoalFragment : Fragment(R.layout.fragment_goal) {

    private val binding by viewBinding(FragmentGoalBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTitle.text = "Goal"
    }
}
