package ru.ramozjikevic.mymap.data.repository

import ru.ramozjikevic.mymap.data.local.TestDao
import ru.ramozjikevic.mymap.data.local.TestEntity
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(
    private val testDao: TestDao
) : TestRepository {

    override fun loadTestData() = testDao.getTestByPage()
    override fun saveTestData() = testDao.insertTest(
        listOf(
            TestEntity(1, "loaded"),
            TestEntity(2, "loaded2")
        )
    )
}