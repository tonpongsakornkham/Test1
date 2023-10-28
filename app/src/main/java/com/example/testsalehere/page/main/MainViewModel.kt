package com.example.testsalehere.page.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testsalehere.di.SocketManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val socketManager: SocketManager
) : ViewModel() {

    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int> get() = _counter

    init {
        socketManager.init()
        socketManager.getSocket()?.connect()

        setupSocket()
    }

    private fun setupSocket() {
        socketManager.getSocket()?.on("new-notification") { data ->
            val newCount = data[0] as? Int
            newCount?.let {
                _counter.postValue(it)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        socketManager.getSocket()?.disconnect()
    }
}
