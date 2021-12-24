package com.example.twowaydatabindingch3
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel(startingTotal:Int):ViewModel() {

    private var total = MutableLiveData<Int>()
    val data : LiveData<Int>
        get() = total

    val inputText = MutableLiveData<String>()
    init {
        total.value = startingTotal
    }

    fun setTotal(){
        val intInput = inputText.value!!.toInt()
        total.value  = total.value?.plus(intInput)
    }
}

