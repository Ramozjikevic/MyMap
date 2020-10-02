package ru.ramozjikevic.mymap.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TestDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTest(list: List<TestEntity>): LongArray

    @Query("SELECT * FROM test_entity")
    fun getTestByPage(): List<TestEntity>
}