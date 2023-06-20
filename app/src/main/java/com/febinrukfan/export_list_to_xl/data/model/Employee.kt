package com.febinrukfan.export_list_to_xl.data.model

import androidx.databinding.BaseObservable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "employee")
data class Employee(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "employee_id")
    var EmpID: Int?,
    @ColumnInfo("employee_name")
    val EmpName: String?
    ) : Serializable, BaseObservable()
