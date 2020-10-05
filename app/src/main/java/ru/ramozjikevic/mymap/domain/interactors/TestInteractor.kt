package ru.ramozjikevic.mymap.domain.interactors

import ru.ramozjikevic.mymap.data.local.TestEntity
import ru.ramozjikevic.mymap.data.repository.TestRepository
import javax.inject.Inject
import javax.inject.Singleton



@Singleton
class TestInteractor @Inject constructor(
    private val testRepository: TestRepository
) {
    fun loadNewData(data: List<TestEntity>) = testRepository.saveTestData(data)
    fun getTestData() = testRepository.loadTestData()
}
