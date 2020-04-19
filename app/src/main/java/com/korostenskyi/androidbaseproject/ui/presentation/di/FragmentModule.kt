package com.korostenskyi.androidbaseproject.ui.presentation.di

import com.korostenskyi.androidbaseproject.ui.presentation.screens.home.HomeFragment
import org.koin.androidx.fragment.dsl.fragment
import org.koin.dsl.module

val fragmentModule = module {

    fragment { HomeFragment(get()) }
}
