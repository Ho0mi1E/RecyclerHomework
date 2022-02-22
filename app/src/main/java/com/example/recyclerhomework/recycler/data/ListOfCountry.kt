package com.example.recyclerhomework.recycler.data

import com.example.recyclerhomework.recycler.domain.reptor.CountriesRepository
import com.example.recyclerhomework.recycler.domain.models.Country
import com.example.recyclerhomework.recycler.domain.models.CountryForView

object ListOfCountry : CountriesRepository {
    private val list = listOf(
        Country("Беларусь","Минск"),
        Country("Россия", "Москва"),
        Country("Крым", "Наш"),
        Country("Америка", "Вашингтон"),
        Country("Турция", "Станбул")    )

    override fun getCountries(): List<Country> = list

    fun mapper():List<CountryForView>{
        return getCountries().map { country ->
            CountryForView(country.name,country.capital,country.capital)
        }
    }
}