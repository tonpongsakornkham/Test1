package com.example.testsalehere.page.main

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.testsalehere.R
import com.example.testsalehere.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.fragmentPlace)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.nvHome, R.id.nvPocket, R.id.nvAchievement
        ))
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.bnvBar.setupWithNavController(navController)

        supportActionBar?.hide()

        setObserve()
    }

    private fun setObserve() {
        viewModel.counter.observe(this) { count ->
            Log.d("TEST", "setObserve: ")
        }
    }
}