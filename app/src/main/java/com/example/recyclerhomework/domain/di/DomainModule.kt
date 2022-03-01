package com.example.recyclerhomework.domain.di

import com.example.recyclerhomework.data.ListOfCountry
import com.example.recyclerhomework.domain.CountriesRepository
import com.example.recyclerhomework.domain.interactor.CountriesInteractor
import com.example.recyclerhomework.domain.interactor.CountriesInteractorImpl
import org.koin.dsl.module

val domainModule = module {
    single<CountriesInteractor> {
        CountriesInteractorImpl(repository = get())
    }
    single<CountriesRepository> { ListOfCountry }
}