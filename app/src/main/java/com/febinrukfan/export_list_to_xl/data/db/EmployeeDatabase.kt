package com.febinrukfan.export_list_to_xl.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.febinrukfan.export_list_to_xl.data.model.Employee

@Database(entities = [Employee::class], version = 1)
abstract class EmployeeDatabase : RoomDatabase(){

    abstract fun employeeDao(): EmployeeDao

}