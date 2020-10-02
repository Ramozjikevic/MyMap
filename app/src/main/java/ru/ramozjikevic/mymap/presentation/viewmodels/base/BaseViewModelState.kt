package ru.ramozjikevic.mymap.presentation.viewmodels.base

import androidx.lifecycle.SavedStateHandle

interface IViewModelState {
    fun save(outState: SavedStateHandle) {}
    fun restore(outState: SavedStateHandle) : IViewModelState
}