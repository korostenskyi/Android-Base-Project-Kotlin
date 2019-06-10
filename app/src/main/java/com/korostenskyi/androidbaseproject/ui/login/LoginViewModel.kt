package com.korostenskyi.androidbaseproject.ui.login

import androidx.lifecycle.ViewModel
import com.korostenskyi.androidbaseproject.utils.UserInputUtils

class LoginViewModel: ViewModel() {

    fun validateUsername(username: String): Boolean = UserInputUtils.validateUsername(username)

    fun validatePassword(password: String): Boolean = UserInputUtils.validatePassword(password)
}