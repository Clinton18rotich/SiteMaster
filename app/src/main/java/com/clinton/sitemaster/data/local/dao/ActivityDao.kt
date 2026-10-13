package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.Activity
import kotlinx.coroutines.flow.Flow

@Dao
interface ActivityDao {
    @Query("SELECT * FROM activities WHERE date = :date ORDER BY timestamp DESC")
    fun getByDate(date: String): Flow<List<Activity>>
    
    @Insert
    suspend fun insert(activity: Activity): Long
    
    @Query("DELETE FROM activities WHERE section = :section AND sourceId = :sourceId")
    suspend fun deleteBySource(section: String, sourceId: Long)
    
    @Delete
    suspend fun delete(activity: Activity)
}
