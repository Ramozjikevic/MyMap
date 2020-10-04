package ru.ramozjikevic.mymap.ui.component.base.viewmodel

import androidx.lifecycle.*

abstract class BaseViewModel<T : IViewModelState>(
    private val handleState: SavedStateHandle
) : ViewModel()
