package com.korostenskyi.androidbaseproject.ui.base.ui

import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.CallSuper
import androidx.annotation.ColorInt
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import org.koin.androidx.fragment.android.setupKoinFragmentFactory
import timber.log.Timber

abstract class BaseActivity(@LayoutRes layoutId: Int) : AppCompatActivity(layoutId) {

    private var backPressFunction: (() -> Unit)? = null

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.tag(LIFECYCLE_TAG).d("${javaClass.simpleName} onCreate")
        setupKoinFragmentFactory()
        super.onCreate(savedInstanceState)
    }

    @CallSuper
    override fun onDestroy() {
        Timber.tag(LIFECYCLE_TAG).d("${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }

    override fun onBackPressed() {
        backPressFunction?.invoke() ?: super.onBackPressed()
    }

    fun overrideBackPress(block: (() -> Unit)?) {
        backPressFunction = block
    }

    fun setupStatusBar(@ColorInt color: Int) {
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = color
    }

    companion object {
        private const val LIFECYCLE_TAG = "LifecycleEvent"
    }
}
