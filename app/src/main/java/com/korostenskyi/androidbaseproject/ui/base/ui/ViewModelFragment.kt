package com.korostenskyi.androidbaseproject.ui.base.ui

import android.os.Bundle
import android.view.View
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.korostenskyi.androidbaseproject.ui.base.viewModel.BaseViewModel
import com.korostenskyi.utils.InternalLogger
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class ViewModelFragment<V : BaseViewModel>(
    @LayoutRes layoutId: Int,
    private val vmClass: Class<V>
) : Fragment(layoutId) {

    @Inject lateinit var vmFactory: ViewModelProvider.Factory
    protected lateinit var viewModel: V

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        InternalLogger.lifecycleEvent("${javaClass.simpleName} onCreate")
        AndroidSupportInjection.inject(this)
        viewModel = ViewModelProvider(this, vmFactory).get(vmClass).apply {
            onCreate()
        }
    }

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        InternalLogger.lifecycleEvent("${javaClass.simpleName} onViewCreated")
        viewModel.onViewCreated()
    }

    @CallSuper
    override fun onStart() {
        super.onStart()
        InternalLogger.lifecycleEvent("${javaClass.simpleName} onStart")
        viewModel.onStart()
    }

    @CallSuper
    override fun onResume() {
        super.onResume()
        InternalLogger.lifecycleEvent("${javaClass.simpleName} onResume")
        viewModel.onResume()
    }

    @CallSuper
    override fun onPause() {
        InternalLogger.lifecycleEvent("${javaClass.simpleName} onPause")
        viewModel.onPause()
        super.onPause()
    }

    @CallSuper
    override fun onStop() {
        InternalLogger.lifecycleEvent("${javaClass.simpleName} onStop")
        viewModel.onStop()
        super.onStop()
    }

    @CallSuper
    override fun onDestroyView() {
        InternalLogger.lifecycleEvent("${javaClass.simpleName} onDestroyView")
        viewModel.onDestroyView()
        super.onDestroyView()
    }

    @CallSuper
    override fun onDestroy() {
        InternalLogger.lifecycleEvent("${javaClass.simpleName} onDestroy")
        viewModel.onDestroy()
        super.onDestroy()
    }
}