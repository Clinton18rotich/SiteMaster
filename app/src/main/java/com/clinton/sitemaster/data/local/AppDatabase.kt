package com.clinton.sitemaster.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.clinton.sitemaster.data.local.dao.*
import com.clinton.sitemaster.data.local.entity.*

@Database(
    entities = [
        DiaryEntry::class,
        Worker::class,
        Attendance::class,
        Material::class,
        StockItem::class,
        ConcretePour::class,
        Inspection::class,
        NCR::class,
        Activity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun diaryDao(): DiaryDao
    abstract fun workerDao(): WorkerDao
    abstract fun attendanceDao(): AttendanceDao
    abstract fun materialDao(): MaterialDao
    abstract fun stockDao(): StockDao
    abstract fun concreteDao(): ConcreteDao
    abstract fun inspectionDao(): InspectionDao
    abstract fun ncrDao(): NCRDao
    abstract fun activityDao(): ActivityDao
}
