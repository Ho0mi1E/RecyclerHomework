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

    private val list1 = listOf<Country>(
        Country("Египет","Каир"),
        Country("Австралия","Камббера"),
        Country("Китай","Пекин"),
        Country("Египет","Каир"),
    )

    override fun getCountries(): List<Country> = list
    override fun getUpdate(): List<Country> = list1
}