package com.korostenskyi.androidbaseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
        startActivity(Intent(this, MainActivity::class.java))
    }
}
