package com.clinton.sitemaster.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "materials")
data class Material(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val date: String,
    val category: String,
    val name: String,
    val quantity: Double,
    val unit: String,
    val type: String, // "delivery" or "usage"
    val source: String = "", // supplier for delivery
    val location: String = "", // location for usage
    val notes: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
