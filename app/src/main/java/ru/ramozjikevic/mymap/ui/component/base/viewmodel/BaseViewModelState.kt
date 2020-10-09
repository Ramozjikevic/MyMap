package ru.ramozjikevic.mymap.ui.component.base.viewmodel

import androidx.lifecycle.SavedStateHandle

interface BaseViewModelState {
    fun save(outState: SavedStateHandle) {}
    fun restore(outState: SavedStateHandle) : BaseViewModelState
}