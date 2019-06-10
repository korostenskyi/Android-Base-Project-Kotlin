package com.korostenskyi.androidbaseproject.ui.login

import android.content.Context
import androidx.lifecycle.ViewModel
import com.korostenskyi.androidbaseproject.utils.NetworkUtils
import com.korostenskyi.androidbaseproject.utils.UserInputUtils

class LoginViewModel: ViewModel() {

    fun checkNetworkAvailability(context: Context): Boolean = NetworkUtils.isNetworkAvailable(context)

    fun validateUsername(username: String): Boolean = UserInputUtils.validateUsername(username)

    fun validatePassword(password: String): Boolean = UserInputUtils.validatePassword(password)

    // TODO: Implement your own credentials validation depending on service you use.
    fun validateCredentials(username: String, password: String): Boolean = true
}