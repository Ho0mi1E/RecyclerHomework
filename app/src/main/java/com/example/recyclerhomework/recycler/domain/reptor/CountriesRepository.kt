package com.example.recyclerhomework.recycler.domain.reptor

import com.example.recyclerhomework.recycler.domain.models.Country

interface CountriesRepository {

    fun getCountries() : List<Country>
}