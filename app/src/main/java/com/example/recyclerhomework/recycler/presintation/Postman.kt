package com.example.recyclerhomework.recycler.presintation

import com.example.recyclerhomework.recycler.domain.models.CountryForView

interface Postman {
    fun mail(data: CountryForView)
}