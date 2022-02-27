package com.example.recyclerhomework.presintation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerhomework.data.ListOfCountry
import com.example.recyclerhomework.domain.interactor.CountriesInteractorImpl
import com.example.recyclerhomework.domain.models.CountryForView
import com.example.recyclerhomework.domain.interactor.CountriesInteractor
import com.example.recyclerhomework.domain.CountriesRepository

class ViewModelCountry : ViewModel() {
init {
loadCountries()
}
    val countryLiveData: LiveData<List<CountryForView>> get() = _countryLiveData
    private val _countryLiveData = MutableLiveData<List<CountryForView>>()
    private val repository: CountriesRepository = ListOfCountry
    private val interactor: CountriesInteractor = CountriesInteractorImpl(repository)

    private fun loadCountries(){
        _countryLiveData.value=interactor.getCountries()
    }
}