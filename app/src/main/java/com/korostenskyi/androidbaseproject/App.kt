package com.korostenskyi.androidbaseproject

import android.app.Application
import com.korostenskyi.androidbaseproject.di.AppComponent
import com.korostenskyi.androidbaseproject.di.DaggerAppComponent
import com.korostenskyi.androidbaseproject.di.modules.ApplicationModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App: Application(), HasAndroidInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
            .apply { inject(this@App) }
    }

    companion object {
        lateinit var appComponent: AppComponent
    }
}
