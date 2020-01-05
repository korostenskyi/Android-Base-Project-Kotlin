package com.korostenskyi.androidbaseproject.ui.base.viewModel

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    // TODO: Add InternalLogger logs here

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
        super.onCleared()
    }
}