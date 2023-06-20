package com.febinrukfan.export_list_to_xl.data.datasource

import com.febinrukfan.export_list_to_xl.data.model.Employee
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {

    suspend fun addEmployee(employee: Employee)
    suspend fun deleteEmployee(employee: Employee)
    fun getAllEmployees(): Flow<List<Employee>>

}