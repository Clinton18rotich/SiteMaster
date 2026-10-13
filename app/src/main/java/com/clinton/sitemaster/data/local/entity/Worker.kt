package com.clinton.sitemaster.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workers")
data class Worker(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val trade: String,
    val company: String = "",
    val phone: String = "",
    val isActive: Boolean = true,
    val registeredDate: String,
    val timestamp: Long = System.currentTimeMillis()
)
