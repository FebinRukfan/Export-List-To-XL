package com.febinrukfan.export_list_to_xl.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.febinrukfan.export_list_to_xl.model.EmployeeTableModel

@Database(entities = [EmployeeTableModel::class], version = 1, exportSchema = false)
abstract class EmployeeDatabase : RoomDatabase(){



    abstract fun employeeDao(): EmployeeDao

    companion object {

        @Volatile
        private var INSTANCE: EmployeeDatabase? = null

        fun getDataBaseClient(context: Context) : EmployeeDatabase {

            if (INSTANCE != null) return INSTANCE!!

            synchronized(this) {

                INSTANCE = Room
                    .databaseBuilder(context, EmployeeDatabase::class.java, "Employee_Database")
                    .fallbackToDestructiveMigration()
                    .build()

                return INSTANCE!!

            }
        }

    }

}