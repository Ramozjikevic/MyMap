package ru.ramozjikevic.mymap.ui.component.base.viewmodel

import androidx.lifecycle.SavedStateHandle

interface IViewModelState {
    fun save(outState: SavedStateHandle) {}
    fun restore(outState: SavedStateHandle) : IViewModelState
}