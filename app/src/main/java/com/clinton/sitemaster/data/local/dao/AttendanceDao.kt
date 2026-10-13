package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.Attendance
import kotlinx.coroutines.flow.Flow

@Dao
interface AttendanceDao {
    @Query("SELECT * FROM attendance WHERE date = :date")
    fun getByDate(date: String): Flow<List<Attendance>>
    
    @Query("SELECT * FROM attendance WHERE workerId = :workerId AND date = :date")
    suspend fun getByWorkerAndDate(workerId: Long, date: String): Attendance?
    
    @Insert
    suspend fun insert(attendance: Attendance): Long
    
    @Update
    suspend fun update(attendance: Attendance)
    
    @Delete
    suspend fun delete(attendance: Attendance)
    
    @Query("DELETE FROM attendance WHERE workerId = :workerId AND date = :date")
    suspend fun deleteByWorkerAndDate(workerId: Long, date: String)
}
