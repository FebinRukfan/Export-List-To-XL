package com.febinrukfan.export_list_to_xl.presentation.di

import android.content.Context
import androidx.room.Room
import com.febinrukfan.export_list_to_xl.data.db.EmployeeDao
import com.febinrukfan.export_list_to_xl.data.db.EmployeeDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabase(context : Context) : EmployeeDatabase {
        return Room.databaseBuilder(context, EmployeeDatabase::class.java,"EmployeeDatabase").build()
    }

    @Singleton
    @Provides
    fun providesEmpdao(employeeDB : EmployeeDatabase) : EmployeeDao {
        return employeeDB.employeeDao()
    }
}