package com.korostenskyi.androidbaseproject.di

import com.korostenskyi.androidbaseproject.App
import com.korostenskyi.androidbaseproject.di.modules.ActivityInjectorSubcomponent
import com.korostenskyi.androidbaseproject.di.modules.ApplicationModule
import com.korostenskyi.androidbaseproject.di.modules.ViewModelFactoryModule
import com.korostenskyi.data.di.DataModule
import com.korostenskyi.domain.di.DomainModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    DataModule::class,
    DomainModule::class,
    ViewModelFactoryModule::class,
    ActivityInjectorSubcomponent::class,
    AndroidSupportInjectionModule::class
])
interface AppComponent {

    fun inject(application: App)

    @Component.Builder
    interface Builder {

        fun applicationModule(applicationModule: ApplicationModule): Builder

        fun build(): AppComponent
    }
}