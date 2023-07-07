package com.febinrukfan.export_list_to_xl.domain.usecases

import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.domain.repository.EmployeeRepository

class DeleteAllEmployeeUC (private val employeeRepository: EmployeeRepository)
{

    suspend fun execute() = employeeRepository.deleteAllEmployee()

}