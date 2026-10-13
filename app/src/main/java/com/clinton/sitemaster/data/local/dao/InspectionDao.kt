package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.Inspection
import kotlinx.coroutines.flow.Flow

@Dao
interface InspectionDao {
    @Query("SELECT * FROM inspections WHERE date = :date ORDER BY timestamp DESC")
    fun getByDate(date: String): Flow<List<Inspection>>
    
    @Insert
    suspend fun insert(inspection: Inspection): Long
    
    @Update
    suspend fun update(inspection: Inspection)
    
    @Delete
    suspend fun delete(inspection: Inspection)
}
