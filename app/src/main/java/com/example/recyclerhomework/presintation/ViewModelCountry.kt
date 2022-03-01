package com.example.recyclerhomework.presintation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerhomework.domain.models.CountryForView
import com.example.recyclerhomework.domain.interactor.CountriesInteractor


class ViewModelCountry(val interactor: CountriesInteractor) : ViewModel() {



    val countryLiveData: LiveData<List<CountryForView>> get() = _countryLiveData
    private val _countryLiveData = MutableLiveData<List<CountryForView>>()

    init {
        loadCountries()
    }
    fun update(){
        _countryLiveData.value = interactor.updateCountries()
    }


     fun loadCountries() {
        _countryLiveData.value = interactor.getCountries()
    }

}