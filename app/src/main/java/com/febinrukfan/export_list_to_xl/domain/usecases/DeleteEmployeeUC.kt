package com.febinrukfan.export_list_to_xl.domain.usecases

import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.domain.repository.EmployeeRepository
import javax.inject.Inject

class DeleteEmployeeUC @Inject constructor (private val employeeRepository: EmployeeRepository) {
    suspend fun execute(employee: Employee) = employeeRepository.deleteEmployee(employee)
}