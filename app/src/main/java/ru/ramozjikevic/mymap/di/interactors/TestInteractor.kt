package ru.ramozjikevic.mymap.di.interactors

import ru.ramozjikevic.mymap.data.repository.TestRepository
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class TestInteractor @Inject constructor(
    private val testRepository: TestRepository
) {
    fun loadNewData() = testRepository.saveTestData()
    fun getTestData() = testRepository.loadTestData()
}
