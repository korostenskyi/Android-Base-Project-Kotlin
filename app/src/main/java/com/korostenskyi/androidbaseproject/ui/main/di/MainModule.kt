package com.korostenskyi.androidbaseproject.ui.main.di

import com.korostenskyi.androidbaseproject.di.scope.ActivityScope
import com.korostenskyi.androidbaseproject.ui.routing.Router
import com.korostenskyi.androidbaseproject.ui.routing.impl.RouterImpl
import dagger.Binds
import dagger.Module

@Module(includes = [MainFragmentBindingModule::class])
abstract class MainModule {

    @Binds
    @ActivityScope
    abstract fun bindRouter(impl: RouterImpl): Router
}