package ru.ramozjikevic.mymap.ui.component.first

import android.util.Log
import ru.ramozjikevic.mymap.di.module.rx.SchedulersProvider
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.RxViewModel
import javax.inject.Inject

class FirstViewModel @Inject constructor(
override val schedulers: SchedulersProvider,
private val testInteractor: TestInteractor
) : BaseRxViewModel<FistState>(FistState()) {

    init {
        Log.e("123123 FirstViewModel", "init")
    }
}

data class FistState(
    val isBoolean: Boolean = false
) : IViewModelState