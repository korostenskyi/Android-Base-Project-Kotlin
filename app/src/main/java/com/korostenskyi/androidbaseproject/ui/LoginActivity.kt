package com.korostenskyi.androidbaseproject.ui

import android.content.Intent
import android.os.Bundle
import com.korostenskyi.androidbaseproject.R
import com.korostenskyi.androidbaseproject.ui.base.BaseActivity
import com.korostenskyi.androidbaseproject.utils.UserInputUtils
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sign_in_btn.setOnClickListener {

            val password = password_et.text.toString()

            val validatePassword = UserInputUtils.validatePassword(password)

            if (!validatePassword) {
                showToastLong("Password must be at least 8 characters long and not to have special symbols")
            }

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
