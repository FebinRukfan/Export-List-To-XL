package com.febinrukfan.export_list_to_xl.domain.repository

import androidx.annotation.WorkerThread
import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.data.db.EmployeeDao
import kotlinx.coroutines.flow.Flow

interface EmployeeRepository {

    suspend fun addEmployee(employee: Employee)
    suspend fun deleteEmployee(employee: Employee)
    fun getAllEmployees():Flow<List<Employee>>

    }

