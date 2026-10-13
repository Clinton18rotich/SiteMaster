package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.NCR
import kotlinx.coroutines.flow.Flow

@Dao
interface NCRDao {
    @Query("SELECT * FROM ncrs WHERE date = :date ORDER BY timestamp DESC")
    fun getByDate(date: String): Flow<List<NCR>>
    
    @Query("SELECT * FROM ncrs WHERE status = 'open' ORDER BY timestamp DESC")
    fun getOpen(): Flow<List<NCR>>
    
    @Insert
    suspend fun insert(ncr: NCR): Long
    
    @Update
    suspend fun update(ncr: NCR)
    
    @Delete
    suspend fun delete(ncr: NCR)
}
