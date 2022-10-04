package com.example.fuck2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    private var _swipeDir = MutableLiveData("swiped direction")
    val swipeDir : LiveData<String> = _swipeDir

    fun saveSwipeDir(newDir: String){
        _swipeDir.value = newDir
    }


}