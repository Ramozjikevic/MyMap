package ru.ramozjikevic.mymap.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Single

@Dao
interface TestDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTest(list: List<TestEntity>): Single<LongArray>

    @Query("SELECT * FROM test_entity")
    fun getTestByPage(): Single<List<TestEntity>>
}