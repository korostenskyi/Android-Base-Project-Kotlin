package com.korostenskyi.androidbaseproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.korostenskyi.androidbaseproject.R
import com.korostenskyi.androidbaseproject.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.AppTheme_Launcher)
        super.onCreate(savedInstanceState)

        routeToAppropriatePage()

        finish()
    }


    // You can extend this method by validating the user, for example.
    // And simply route to appropriate if the user is not registered, logged in etc.
    private fun routeToAppropriatePage() {
        startActivity(Intent(this, LoginActivity::class.java))
    }
}
