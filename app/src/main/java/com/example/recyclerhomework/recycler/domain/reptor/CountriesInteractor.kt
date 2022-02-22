package com.example.recyclerhomework.recycler.domain.reptor

import com.example.recyclerhomework.recycler.domain.models.CountryForView

interface CountriesInteractor {
    fun getCountries(): List<CountryForView>
}