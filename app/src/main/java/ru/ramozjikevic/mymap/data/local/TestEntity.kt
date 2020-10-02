package ru.ramozjikevic.mymap.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "test_entity"
)
data class TestEntity(
    @PrimaryKey
    val id: Long,
    val content: String
)