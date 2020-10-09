package ru.ramozjikevic.mymap.data.repository

import ru.ramozjikevic.mymap.data.local.dao.TestDao
import ru.ramozjikevic.mymap.data.local.models.TestEntity
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(
    private val testDao: TestDao
) : TestRepository {
    override fun loadTestData() = testDao.getTestByPage()
    override fun saveTestData(data: List<TestEntity>) = testDao.insertTest(data)
}