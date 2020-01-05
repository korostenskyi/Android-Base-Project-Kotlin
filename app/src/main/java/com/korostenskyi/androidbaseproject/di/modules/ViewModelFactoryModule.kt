package com.korostenskyi.androidbaseproject.di.modules

import androidx.lifecycle.ViewModelProvider
import com.korostenskyi.androidbaseproject.ui.base.viewModel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
interface ViewModelFactoryModule {

    @Binds
    fun bindViewModel(factory: ViewModelFactory): ViewModelProvider.Factory
}