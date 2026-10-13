package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.Material
import kotlinx.coroutines.flow.Flow

@Dao
interface MaterialDao {
    @Query("SELECT * FROM materials WHERE date = :date ORDER BY timestamp DESC")
    fun getByDate(date: String): Flow<List<Material>>
    
    @Insert
    suspend fun insert(material: Material): Long
    
    @Delete
    suspend fun delete(material: Material)
    
    @Query("DELETE FROM materials WHERE id = :id")
    suspend fun deleteById(id: Long)
}
