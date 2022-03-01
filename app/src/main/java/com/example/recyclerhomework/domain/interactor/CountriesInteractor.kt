package com.example.recyclerhomework.domain.interactor

import com.example.recyclerhomework.domain.models.CountryForView

interface CountriesInteractor {
    fun getCountries(): List<CountryForView>
    fun updateCountries(): List<CountryForView>
}