package com.example.recyclerhomework.data

import com.example.recyclerhomework.domain.CountriesRepository
import com.example.recyclerhomework.domain.models.Country


object ListOfCountry : CountriesRepository {
    private val list = listOf(
        Country("Беларусь","Минск"),
        Country("Россия", "Москва"),
        Country("Крым", "Наш"),
        Country("Америка", "Вашингтон"),
        Country("Турция", "Станбул")    )

    override fun getCountries(): List<Country> = list


}