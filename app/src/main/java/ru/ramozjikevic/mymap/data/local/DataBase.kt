package ru.ramozjikevic.mymap.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

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