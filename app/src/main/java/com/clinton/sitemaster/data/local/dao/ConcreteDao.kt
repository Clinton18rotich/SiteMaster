package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.ConcretePour
import kotlinx.coroutines.flow.Flow

@Dao
interface ConcreteDao {
    @Query("SELECT * FROM concrete_pours WHERE date = :date ORDER BY timestamp DESC")
    fun getByDate(date: String): Flow<List<ConcretePour>>
    
    @Query("SELECT * FROM concrete_pours ORDER BY timestamp DESC")
    fun getAll(): Flow<List<ConcretePour>>
    
    @Insert
    suspend fun insert(pour: ConcretePour): Long
    
    @Delete
    suspend fun delete(pour: ConcretePour)
}
