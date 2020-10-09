package ru.ramozjikevic.mymap.ui.component.second

import android.util.Log
import ru.ramozjikevic.mymap.data.local.models.TestEntity
import ru.ramozjikevic.mymap.di.module.rx.SchedulersProvider
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.RxViewModel
import javax.inject.Inject

class SecondViewModel @Inject constructor(
    override val schedulers: SchedulersProvider,
    private val testInteractor: TestInteractor,
) :  BaseRxViewModel<SecondState>(SecondState()) {

    init {
        Log.e("123123 SecondViewModel", "init")
    }

    fun loadTestData() {
        testInteractor.getCharacters()
            .bindSubscriptionAsync(
                onSuccess = {
                    Log.e("123123", "$it")
                },
                onError = {
                    Log.e("123123", "$it")
                }
            )
    }
}

data class SecondState(
    val isBoolean: Boolean = false
) : IViewModelState