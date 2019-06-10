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

        return true
    }
}