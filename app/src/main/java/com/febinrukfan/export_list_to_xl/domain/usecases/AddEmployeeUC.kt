package com.febinrukfan.export_list_to_xl.domain.usecases

import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.domain.repository.EmployeeRepository

class AddEmployeeUC(private val employeeRepository: EmployeeRepository) {
    suspend fun execute(employee: Employee) = employeeRepository.addEmployee(employee)
}