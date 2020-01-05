package com.korostenskyi.androidbaseproject.ui.routing.impl

import androidx.navigation.Navigation.findNavController
import com.korostenskyi.androidbaseproject.R
import com.korostenskyi.androidbaseproject.ui.main.MainActivity
import com.korostenskyi.androidbaseproject.ui.routing.Router
import javax.inject.Inject

class RouterImpl @Inject constructor(
    private val activity: MainActivity
): Router {

    override fun goBack() {
        findNavController(activity, R.id.nav_host_fragment).popBackStack()
    }

    override fun navigateHome() {
        findNavController(activity, R.id.nav_host_fragment).navigate(R.id.fragmentHome)
    }
}