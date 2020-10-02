package ru.ramozjikevic.mymap.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.ramozjikevic.mymap.data.local.TestEntity
import ru.ramozjikevic.mymap.di.interactors.TestInteractor
import javax.inject.Inject

class TestViewModel @Inject constructor(
    private val testInteractor: TestInteractor
) : ViewModel() {
    val testLiveData = MutableLiveData<List<TestEntity>>()

    fun loadMoreTestData() {
        testInteractor.loadNewData()
        val testEntity = testInteractor.getTestData()
        Log.e("123123", testEntity.toString())
        testLiveData.postValue(testEntity)
        Log.e("123123", "1")
    }

    fun getMoviesLiveData() = testLiveData
}