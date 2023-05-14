package com.febinrukfan.export_list_to_xl.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employee_table")
data class EmployeeTableModel(
    @PrimaryKey(autoGenerate = true) val EmpID: Int = 0,
    @ColumnInfo("EmpName") val EmpName: String?)
