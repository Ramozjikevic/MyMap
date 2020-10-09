package ru.ramozjikevic.mymap.ui.component.second

import android.util.Log
import ru.ramozjikevic.mymap.data.remote.models.CharactersRes
import ru.ramozjikevic.mymap.di.module.rx.SchedulersProvider
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState
import javax.inject.Inject
import kotlin.math.log

class SecondViewModel @Inject constructor(
    override val schedulers: SchedulersProvider,
    private val testInteractor: TestInteractor,
) :  BaseRxViewModel<SecondState>(SecondState()) {

    init {
        Log.e("123123 SecondViewModel", "init")
    }

    fun loadTestData() {
        testInteractor.getCharacters()
            .bindSubscription(
                onSuccess = { list ->
                    Log.e("123123", "$list")
                    updateStateAsync { it.copy(character = list) }
                },
                onError = {
                    Log.e("123123", "error")
                }
            )
    }
}

data class SecondState(
    val character: List<CharactersRes> = listOf()
) : IViewModelState