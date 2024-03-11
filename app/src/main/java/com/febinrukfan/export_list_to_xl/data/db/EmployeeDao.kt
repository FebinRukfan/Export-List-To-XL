package com.febinrukfan.export_list_to_xl.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.febinrukfan.export_list_to_xl.data.model.Employee
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeeDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun addEmployee(employee: Employee)
    @Delete
    suspend fun deleteEmployee(employee: Employee)

    @Query("select * from employee")
    fun getAllEmployees():Flow<List<Employee>>

}