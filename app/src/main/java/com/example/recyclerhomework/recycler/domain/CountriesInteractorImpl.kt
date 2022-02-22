package com.example.recyclerhomework.recycler.domain

import com.example.recyclerhomework.recycler.domain.models.CountryForView
import com.example.recyclerhomework.recycler.domain.reptor.CountriesInteractor
import com.example.recyclerhomework.recycler.domain.reptor.CountriesRepository

class CountriesInteractorImpl(private val repository: CountriesRepository) : CountriesInteractor {


    override fun getCountries(): List<CountryForView> {
        return repository.getCountries().map { country ->
            CountryForView(country.name,country.capital,country.capital)
        }
    }
}