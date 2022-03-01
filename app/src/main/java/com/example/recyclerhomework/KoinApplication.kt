package com.example.recyclerhomework

import android.app.Application
import com.example.recyclerhomework.domain.di.domainModule
import com.example.recyclerhomework.presintation.di.viewModelModule
import org.koin.android.ext.koin.androidContext

import org.koin.core.context.startKoin

class KoinApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@KoinApplication)
            modules(listOf(domainModule, viewModelModule))

        }

    }
}