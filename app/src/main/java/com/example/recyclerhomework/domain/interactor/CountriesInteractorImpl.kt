package com.example.recyclerhomework.domain.interactor


import com.example.recyclerhomework.domain.CountriesRepository
import com.example.recyclerhomework.domain.models.CountryForView

class CountriesInteractorImpl(private val repository: CountriesRepository) : CountriesInteractor {


    override fun getCountries(): List<CountryForView> {
        return repository.getCountries().map { country ->
            CountryForView(country.name)
        }
        }
    }