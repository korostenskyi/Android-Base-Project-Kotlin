package com.korostenskyi.androidbaseproject.ui.main.screens.home.di

import androidx.lifecycle.ViewModel
import com.korostenskyi.androidbaseproject.di.ViewModelKey
import com.korostenskyi.androidbaseproject.ui.main.screens.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel
}