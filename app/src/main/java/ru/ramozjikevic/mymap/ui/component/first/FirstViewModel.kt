package ru.ramozjikevic.mymap.ui.component.first

import android.util.Log
import ru.ramozjikevic.mymap.di.module.rx.SchedulersProvider
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.RxViewModel
import javax.inject.Inject

class FirstViewModel @Inject constructor(
    override val schedulers: SchedulersProvider,
    private val testInteractor: TestInteractor
) : RxViewModel() {

    init {
        Log.e("123123 FirstViewModel", "init")
    }

    fun addNewTestEntity() {

    }
}