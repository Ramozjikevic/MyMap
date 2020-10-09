package ru.ramozjikevic.mymap.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.ramozjikevic.mymap.data.local.dao.TestDao
import ru.ramozjikevic.mymap.data.local.models.TestEntity

@Database(
    entities = [
    TestEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class DataBase : RoomDatabase() {
    abstract fun testDao() : TestDao
}