package com.febinrukfan.export_list_to_xl.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.febinrukfan.export_list_to_xl.model.EmployeeTableModel

@Dao
interface EmployeeDao {

    @Query("SELECT * FROM employee_table")
    fun getEmployees(): LiveData<List<EmployeeTableModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(employee: EmployeeTableModel)

    @Query("DELETE FROM employee_table")
    suspend fun deleteAll()

}