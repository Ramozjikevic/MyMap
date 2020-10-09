package ru.ramozjikevic.mymap.ui.component

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.ramozjikevic.mymap.di.module.rx.SchedulersProvider
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState
import javax.inject.Inject

class RootViewModel @Inject constructor(
    override val schedulers: SchedulersProvider,
    private val testInteractor: TestInteractor
) : BaseRxViewModel<RootState>(RootState()) {
    init {
        Log.e("123123 RootViewModel", "init")
    }

    fun get() {
        Log.e("123123 RootViewModel", "get")
    }
}

data class RootState(
    val isBoolean: Boolean = false
) : IViewModelState