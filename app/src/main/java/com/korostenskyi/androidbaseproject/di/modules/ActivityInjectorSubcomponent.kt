package com.korostenskyi.androidbaseproject.di.modules

import com.korostenskyi.androidbaseproject.di.scope.ActivityScope
import com.korostenskyi.androidbaseproject.ui.main.MainActivity
import com.korostenskyi.androidbaseproject.ui.main.di.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityInjectorSubcomponent {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    fun mainActivity(): MainActivity
}