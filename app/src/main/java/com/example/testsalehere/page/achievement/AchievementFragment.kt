package com.example.testsalehere.page.achievement

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.testsalehere.R
import com.example.testsalehere.databinding.FragmentAchievementBinding
import com.example.testsalehere.extension.viewBinding
import com.example.testsalehere.page.achievement.adapter.AchievementItemAdapter
import com.example.testsalehere.page.achievement.entity.generateMockAchievementItem

class AchievementFragment : Fragment(R.layout.fragment_achievement) {

    private val binding by viewBinding(FragmentAchievementBinding::bind)
    private val viewModel : AchievementViewModel by activityViewModels()

    private val achievementItemAdapter : AchievementItemAdapter by lazy { AchievementItemAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpView()
        attachObserve()

        achievementItemAdapter.submitList(generateMockAchievementItem())
    }

    private fun setUpView() {
        binding.apply {
            rvAchievement.apply {
                setHasFixedSize(true)
                layoutManager = GridLayoutManager(requireContext(), 3)
                adapter = achievementItemAdapter
            }
        }
    }

    private fun attachObserve() {
        viewModel.apply {}
    }
}
