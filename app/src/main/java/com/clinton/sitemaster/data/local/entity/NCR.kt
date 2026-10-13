package com.clinton.sitemaster.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ncrs")
data class NCR(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val date: String,
    val ncrNo: String,
    val title: String,
    val category: String,
    val specificIssue: String,
    val severity: String, // Critical, Major, Minor
    val location: String,
    val description: String,
    val actionRequired: String,
    val status: String = "open", // open, closed
    val closedDate: String = "",
    val closedBy: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
