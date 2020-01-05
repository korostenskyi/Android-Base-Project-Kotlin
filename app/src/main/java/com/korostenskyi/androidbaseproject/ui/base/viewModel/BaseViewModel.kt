package com.korostenskyi.androidbaseproject.ui.base.viewModel

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import com.korostenskyi.utils.InternalLogger

abstract class BaseViewModel : ViewModel() {

    init {
        InternalLogger.viewModelEvent("${javaClass.simpleName} init")
    }

    @CallSuper
    open fun onCreate() {}

    @CallSuper
    open fun onViewCreated() {}

    @CallSuper
    open fun onStart() {}

    @CallSuper
    open fun onResume() {}

    @CallSuper
    open fun onPause() {}

    @CallSuper
    open fun onStop() {}

    @CallSuper
    open fun onDestroyView() {}

    @CallSuper
    open fun onDestroy() {}

    @CallSuper
    override fun onCleared() {
        InternalLogger.viewModelEvent("${javaClass.simpleName} onCleared")
        super.onCleared()
    }
}