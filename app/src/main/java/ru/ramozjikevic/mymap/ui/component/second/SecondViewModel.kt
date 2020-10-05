package ru.ramozjikevic.mymap.ui.component.second

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.ramozjikevic.mymap.data.local.TestEntity
import ru.ramozjikevic.mymap.di.module.rx.SchedulersProvider
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.RxViewModel
import javax.inject.Inject
import kotlin.math.log

class SecondViewModel @Inject constructor(
    override val schedulers: SchedulersProvider,
    private val testInteractor: TestInteractor,
) : RxViewModel() {

    init {
        Log.e("123123 SecondViewModel", "init")
    }

    fun loadTestData() {
        testInteractor.putTestData(
            listOf(
                TestEntity(1, "Тест 1", "Контент 1")
            )
        ).flatMap {
            testInteractor.getTestData()
        }
            .bindSubscriptionAsync(
                onSuccess = {
                    Log.e("123123", "$it")
                }
            )
    }
}