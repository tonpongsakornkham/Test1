package com.example.testsalehere.page.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _setTitle = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val setTitle: LiveData<String> = _setTitle
}