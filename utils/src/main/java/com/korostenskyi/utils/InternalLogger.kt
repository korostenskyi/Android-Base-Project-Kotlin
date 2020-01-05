package com.korostenskyi.utils

import android.util.Log

object InternalLogger {

    private const val TAG = "PROJECT_NAME_Logs"

    private val isDebug = BuildConfig.DEBUG

    fun initInternalLogger() {
        val message = "Internal logger starts on " + "${android.os.Build.MODEL} " +
                "with Android ${android.os.Build.VERSION.RELEASE}"
        if (isDebug) Log.d(TAG, message)
    }

    fun log(log: String) {
        if (isDebug) Log.i(TAG, "Log: $log")
    }

    fun error(log: String, error: Throwable? = null) {
        if (isDebug) Log.e(TAG, "Error: $log ${error?.message}")
    }

    fun lifecycleEvent(log: String) {
        if (isDebug) Log.i(TAG, "Lifecycle event: $log")
    }

    fun viewModelEvent(log: String) {
        if (isDebug) Log.i(TAG, "ViewModel event: $log")
    }
}