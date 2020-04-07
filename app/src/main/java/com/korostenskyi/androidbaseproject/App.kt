package com.korostenskyi.androidbaseproject

import android.app.Application
import com.korostenskyi.androidbaseproject.di.applicationModule
import com.korostenskyi.androidbaseproject.ui.presentation.di.presentationModule
import com.korostenskyi.data.di.dataModule
import com.korostenskyi.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(applicationModule + presentationModule + dataModule + domainModule)
        }
    }
}
