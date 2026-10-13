package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.Worker
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkerDao {
    @Query("SELECT * FROM workers WHERE isActive = 1 ORDER BY name")
    fun getAllActive(): Flow<List<Worker>>
    
    @Insert
    suspend fun insert(worker: Worker): Long
    
    @Update
    suspend fun update(worker: Worker)
    
    @Delete
    suspend fun delete(worker: Worker)
    
    @Query("SELECT * FROM workers WHERE id = :id")
    suspend fun getById(id: Long): Worker?
}
