package ru.ramozjikevic.mymap.ui.component.base.viewmodel

import androidx.annotation.UiThread
import androidx.lifecycle.*

abstract class BaseRxViewModel<T: BaseViewModelState>(
    private val handleState: SavedStateHandle,
    initState: T
) : RxViewModel() {

    val state: MediatorLiveData<T> = MediatorLiveData<T>().apply {
        value = initState
    }

    val currentState
        get() = state.value!!

    @UiThread
    protected inline fun updateState(update: (currentState: T) -> T) {
        val updatedState: T = update(currentState)
        state.value = updatedState
    }



}
