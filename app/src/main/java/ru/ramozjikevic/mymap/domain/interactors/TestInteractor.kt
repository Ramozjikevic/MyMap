package ru.ramozjikevic.mymap.domain.interactors

import ru.ramozjikevic.mymap.data.local.models.TestEntity
import ru.ramozjikevic.mymap.data.repository.TestRepository
import ru.ramozjikevic.mymap.data.remote.RestService
import javax.inject.Inject
import javax.inject.Singleton



@Singleton
class TestInteractor @Inject constructor(
    private val testRepository: TestRepository,
    private val restService: RestService
) {
    fun putTestData(data: List<TestEntity>) = testRepository.saveTestData(data)
    fun getTestData() = testRepository.loadTestData()
    fun getCharacters() = restService.getCharacters()
}
