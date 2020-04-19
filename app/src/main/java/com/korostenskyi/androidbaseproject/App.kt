package com.korostenskyi.androidbaseproject

import android.app.Application
import com.korostenskyi.androidbaseproject.di.applicationModule
import com.korostenskyi.androidbaseproject.ui.presentation.di.fragmentModule
import com.korostenskyi.androidbaseproject.ui.presentation.di.viewModelModule
import com.korostenskyi.data.di.dataModule
import com.korostenskyi.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
        initTimber()
    }

    private fun initKoin() {
        val modules = listOf(
            applicationModule,
            fragmentModule,
            viewModelModule,
            dataModule,
            domainModule
        )
        startKoin {
            if (BuildConfig.DEBUG) printLogger(Level.DEBUG)
            androidContext(this@App)
            fragmentFactory()
            loadKoinModules(modules)
        }
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
