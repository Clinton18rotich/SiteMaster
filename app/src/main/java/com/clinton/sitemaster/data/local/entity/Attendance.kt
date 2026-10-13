package com.clinton.sitemaster.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "attendance")
data class Attendance(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val workerId: Long,
    val workerName: String,
    val trade: String,
    val date: String,
    val status: String = "Present", // Present, Absent, Half-day
    val tasks: String = "", // comma-separated tasks
    val hoursWorked: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
