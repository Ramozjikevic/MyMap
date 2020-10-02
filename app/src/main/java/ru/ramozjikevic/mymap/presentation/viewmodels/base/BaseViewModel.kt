package ru.ramozjikevic.mymap.presentation.viewmodels.base

import androidx.annotation.UiThread
import androidx.lifecycle.*

abstract class BaseViewModel<T :IViewModelState>(
    private val handleState: SavedStateHandle
) : ViewModel()
