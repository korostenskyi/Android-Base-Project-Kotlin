package com.korostenskyi.androidbaseproject.di

import com.korostenskyi.androidbaseproject.ui.login.LoginViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val loginModule = module {
    viewModel { LoginViewModel() }
}