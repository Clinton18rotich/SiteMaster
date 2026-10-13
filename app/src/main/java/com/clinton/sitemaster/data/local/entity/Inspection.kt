package com.clinton.sitemaster.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "inspections")
data class Inspection(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val date: String,
    val phase: String, // "Foundation to Slab", "Blockwork", etc.
    val location: String,
    val checklistItems: String, // JSON: [{item, passed, notes}]
    val totalItems: Int,
    val passedItems: Int,
    val status: String = "open", // open, passed, failed
    val notes: String = "",
    val inspector: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
