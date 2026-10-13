package com.clinton.sitemaster.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "activities")
data class Activity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val date: String,
    val section: String, // "Concrete", "Labour", "Materials", "Inspection", "NCR"
    val sourceId: Long, // ID of source record
    val title: String,
    val location: String,
    val details: String,
    val timestamp: Long = System.currentTimeMillis()
)
