package com.example.recyclerhomework.domain

import com.example.recyclerhomework.domain.models.Country

interface CountriesRepository {
    fun getCountries() : List<Country>
    fun getUpdate() : List<Country>
}