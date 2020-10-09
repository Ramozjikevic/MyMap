package ru.ramozjikevic.mymap.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "test_entity"
)
data class TestEntity(
    @PrimaryKey
    val id: Long,
    val title: String,
    val content: String
)