package com.clinton.sitemaster.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "concrete_pours")
data class ConcretePour(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val date: String,
    val elementType: String, // Slab, Column, Beam, Staircase, etc.
    val location: String,
    val grade: String, // C25/30, etc.
    val length: Double = 0.0,
    val width: Double = 0.0,
    val thickness: Double = 0.0,
    val beamCountL: Int = 0,
    val beamCountT: Int = 0,
    val beamWidth: Double = 0.0,
    val beamDepth: Double = 0.0,
    val beamLengthL: Double = 0.0,
    val beamLengthT: Double = 0.0,
    val totalVolume: Double,
    val wastage: Double = 1.05,
    val cementBags: Int,
    val status: String = "Poured",
    val notes: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
