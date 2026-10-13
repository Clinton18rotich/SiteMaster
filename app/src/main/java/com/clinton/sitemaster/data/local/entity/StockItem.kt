package com.clinton.sitemaster.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stock")
data class StockItem(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val category: String,
    val quantity: Double,
    val unit: String,
    val minStock: Double = 10.0,
    val lastDeliveryDate: String = "",
    val status: String = "approved", // approved, pending_inspection, rejected
    val timestamp: Long = System.currentTimeMillis()
)
