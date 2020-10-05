package ru.ramozjikevic.mymap.ui.component

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import javax.inject.Inject

class RootViewModel @Inject constructor(
    private val testInteractor: TestInteractor
) : ViewModel() {

    init {
        Log.e("123123 RootViewModel", "init")
    }

    fun loadMoreTestData() {
    }
}