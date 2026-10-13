package com.clinton.sitemaster.data.local.dao

import androidx.room.*
import com.clinton.sitemaster.data.local.entity.StockItem
import kotlinx.coroutines.flow.Flow

@Dao
interface StockDao {
    @Query("SELECT * FROM stock ORDER BY name")
    fun getAll(): Flow<List<StockItem>>
    
    @Query("SELECT * FROM stock WHERE name = :name")
    suspend fun getByName(name: String): StockItem?
    
    @Insert
    suspend fun insert(item: StockItem): Long
    
    @Update
    suspend fun update(item: StockItem)
    
    @Query("UPDATE stock SET quantity = quantity + :qty WHERE name = :name")
    suspend fun addQuantity(name: String, qty: Double)
    
    @Query("UPDATE stock SET quantity = quantity - :qty WHERE name = :name")
    suspend fun subtractQuantity(name: String, qty: Double)
}
