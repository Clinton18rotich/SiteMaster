package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.DiaryEntry
import kotlinx.coroutines.flow.Flow

@Dao
interface DiaryDao {
    @Query("SELECT * FROM diary_entries WHERE date = :date ORDER BY timestamp DESC")
    fun getByDate(date: String): Flow<List<DiaryEntry>>
    
    @Query("SELECT * FROM diary_entries ORDER BY timestamp DESC")
    fun getAll(): Flow<List<DiaryEntry>>
    
    @Insert
    suspend fun insert(entry: DiaryEntry): Long
    
    @Update
    suspend fun update(entry: DiaryEntry)
    
    @Delete
    suspend fun delete(entry: DiaryEntry)
    
    @Query("DELETE FROM diary_entries WHERE sourceSection = :section AND sourceId = :sourceId")
    suspend fun deleteBySource(section: String, sourceId: Long)
}
