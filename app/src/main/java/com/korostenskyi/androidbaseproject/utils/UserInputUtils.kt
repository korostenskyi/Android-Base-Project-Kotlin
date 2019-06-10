package com.korostenskyi.androidbaseproject.utils

object UserInputUtils {

    private val forbiddenSymbols = arrayListOf(".", ",", "/", "?", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "<", ">", "\"", "\\", "'", ":", ";", "[", "]", "{", "}", "|", " ")

    fun validatePassword(password: String): Boolean {

        if (password.length < 8) {
            return false
        }

        forbiddenSymbols.forEach { symbol ->
            if (password.contains(symbol)) {
                return false
            }
        }

        return checkInputForForbiddenSymbols(password)
    }

    fun validateUsername(username: String): Boolean {

        if (username.length < 4) {
            return false
        }

        return checkInputForForbiddenSymbols(username)
    }

    private fun checkInputForForbiddenSymbols(input: String): Boolean {
        forbiddenSymbols.forEach {symbol ->
            if (input.contains(symbol)) {
                return false
            }
        }

        return true
    }
}