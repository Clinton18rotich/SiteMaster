package com.clinton.sitemaster.di

import android.content.Context
import androidx.room.Room
import com.clinton.sitemaster.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "sitemaster.db"
        ).fallbackToDestructiveMigration().build()
    }
    
    @Provides
    fun provideDiaryDao(db: AppDatabase) = db.diaryDao()
    @Provides
    fun provideWorkerDao(db: AppDatabase) = db.workerDao()
    @Provides
    fun provideAttendanceDao(db: AppDatabase) = db.attendanceDao()
    @Provides
    fun provideMaterialDao(db: AppDatabase) = db.materialDao()
    @Provides
    fun provideStockDao(db: AppDatabase) = db.stockDao()
    @Provides
    fun provideConcreteDao(db: AppDatabase) = db.concreteDao()
    @Provides
    fun provideInspectionDao(db: AppDatabase) = db.inspectionDao()
    @Provides
    fun provideNcrDao(db: AppDatabase) = db.ncrDao()
    @Provides
    fun provideActivityDao(db: AppDatabase) = db.activityDao()
}
