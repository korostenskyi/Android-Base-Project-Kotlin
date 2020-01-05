package com.korostenskyi.androidbaseproject.ui.main.screens.home

import com.korostenskyi.androidbaseproject.R
import com.korostenskyi.androidbaseproject.ui.base.ui.ViewModelFragment

class HomeFragment : ViewModelFragment<HomeViewModel>(
    R.layout.fragment_home,
    HomeViewModel::class.java
)
