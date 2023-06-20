package com.febinrukfan.export_list_to_xl.data.datasource_impl

import com.febinrukfan.export_list_to_xl.data.datasource.LocalDataSource
import com.febinrukfan.export_list_to_xl.data.db.EmployeeDao
import com.febinrukfan.export_list_to_xl.data.model.Employee
import kotlinx.coroutines.flow.Flow

class LocalDataSourceImpl(private val empDao : EmployeeDao) : LocalDataSource {

    override suspend fun addEmployee(employee: Employee) {
        empDao.addEmployee(employee)
    }
    override suspend fun deleteEmployee(employee: Employee) { empDao.deleteEmployee(employee)
    }

    override fun getAllEmployees(): Flow<List<Employee>> {
        return empDao.getAllEmployees()
    }

}