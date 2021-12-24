package com.example.twowaydatabindingch3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModel::class.java))
            return ViewModel(startingTotal) as T
        throw IllegalArgumentException("Wrong View Model class!")
    }
}

