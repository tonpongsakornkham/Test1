package com.example.testsalehere.page.pocket

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PocketViewModel : ViewModel() {

    private val _setTitle = MutableLiveData<String>().apply {
        value = "This is Pocket Fragment"
    }

    val setTitle: LiveData<String> = _setTitle
}
