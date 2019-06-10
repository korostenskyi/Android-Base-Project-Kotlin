package com.korostenskyi.androidbaseproject.ui.login

import android.content.Intent
import android.os.Bundle
import com.korostenskyi.androidbaseproject.R
import com.korostenskyi.androidbaseproject.ui.MainActivity
import com.korostenskyi.androidbaseproject.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.inject

class LoginActivity : BaseActivity() {

    private val viewModel: LoginViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sign_in_btn.setOnClickListener {

            val username = username_et.text.toString()
            val password = password_et.text.toString()

            val validateUsername = viewModel.validateUsername(username)
            val validatePassword = viewModel.validatePassword(password)

            if (!validateUsername) {
                showToastLong("Username must be at least 4 characters long and not to have special symbols")
            } else if (!validatePassword) {
                showToastLong("Password must be at least 8 characters long and not to have special symbols")
            } else {

                val validateCredentials = viewModel.validateCredentials(username, password)

                if (!validateCredentials) {
                    showToastShort("Username or password is incorrect")
                } else {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
            }
        }
    }
}
