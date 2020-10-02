package ru.ramozjikevic.mymap.data.repository

import ru.ramozjikevic.mymap.data.local.TestEntity

interface TestRepository {
    fun loadTestData(): List<TestEntity>
    fun saveTestData(): LongArray
}