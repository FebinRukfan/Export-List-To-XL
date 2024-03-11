package com.febinrukfan.export_list_to_xl.domain.usecases

import com.febinrukfan.export_list_to_xl.domain.repository.EmployeeRepository
import javax.inject.Inject

class DeleteAllEmployeeUC  @Inject constructor (private val employeeRepository: EmployeeRepository)
{

    suspend fun execute() = employeeRepository.deleteAllEmployee()

}