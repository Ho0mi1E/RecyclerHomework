package com.example.recyclerhomework.recycler.presintation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerhomework.recycler.data.ListOfCountry
import com.example.recyclerhomework.recycler.domain.CountriesInteractorImpl
import com.example.recyclerhomework.recycler.domain.models.CountryForView
import com.example.recyclerhomework.recycler.domain.reptor.CountriesInteractor
import com.example.recyclerhomework.recycler.domain.reptor.CountriesRepository

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