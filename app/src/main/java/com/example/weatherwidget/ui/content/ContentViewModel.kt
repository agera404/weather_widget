package com.example.weatherwidget.ui.content

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ContentViewModel : ViewModel() {
    val currentCity: MutableLiveData<String> = MutableLiveData<String>()
    init {
        currentCity.value = "Москва"
    }


}