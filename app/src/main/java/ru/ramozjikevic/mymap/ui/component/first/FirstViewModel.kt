package ru.ramozjikevic.mymap.ui.component.first

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import javax.inject.Inject

class FirstViewModel @Inject constructor(
    private val testInteractor: TestInteractor
) : ViewModel() {

    init {
        Log.e("123123 FirstViewModel", "init")
    }

    fun loadMoreTestData() {
        val testEntity = testInteractor.getTestData()
        Log.e("123123 FirstViewModel", testEntity.toString())
    }
}