package com.example.recyclerhomework.presintation.di

import com.example.recyclerhomework.presintation.ViewModelCountry
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        ViewModelCountry(interactor = get())
    }
}