package ru.ramozjikevic.mymap.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import ru.ramozjikevic.mymap.presentation.viewmodels.base.BaseViewModel
import ru.ramozjikevic.mymap.presentation.viewmodels.base.IViewModelState

abstract class BaseActivity<T : BaseViewModel<out IViewModelState>>: AppCompatActivity() {

}