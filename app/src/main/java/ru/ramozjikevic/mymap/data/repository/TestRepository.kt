package ru.ramozjikevic.mymap.data.repository

import io.reactivex.Single
import ru.ramozjikevic.mymap.data.local.models.TestEntity

interface TestRepository {
    fun loadTestData(): Single<List<TestEntity>>
    fun saveTestData(data: List<TestEntity>): Single<LongArray>
}