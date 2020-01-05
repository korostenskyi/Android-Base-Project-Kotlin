package com.korostenskyi.androidbaseproject.ui.main.di

import com.korostenskyi.androidbaseproject.di.scope.FragmentScope
import com.korostenskyi.androidbaseproject.ui.main.screens.home.HomeFragment
import com.korostenskyi.androidbaseproject.ui.main.screens.home.di.HomeModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBindingModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [HomeModule::class])
    internal abstract fun homeFragment(): HomeFragment
}