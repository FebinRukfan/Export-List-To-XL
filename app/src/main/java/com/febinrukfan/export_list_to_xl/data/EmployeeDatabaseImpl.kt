package com.febinrukfan.export_list_to_xl.data

import com.febinrukfan.export_list_to_xl.data.datasource.LocalDataSource
import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.domain.repository.EmployeeRepository
import kotlinx.coroutines.flow.Flow

class EmployeeDatabaseImpl(private val localDataSource: LocalDataSource) : EmployeeRepository{

    override suspend fun addEmployee(employee: Employee) {
        localDataSource.addEmployee(employee)
    }

    override suspend fun deleteEmployee(employee: Employee) {
        localDataSource.deleteEmployee(employee)
    }

    override fun getAllEmployees(): Flow<List<Employee>> {
        return localDataSource.getAllEmployees()
    }


}