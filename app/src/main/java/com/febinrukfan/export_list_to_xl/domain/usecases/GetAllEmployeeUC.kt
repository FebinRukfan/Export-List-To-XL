package com.febinrukfan.export_list_to_xl.domain.usecases

import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.domain.repository.EmployeeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllEmployeeUC  @Inject constructor (private val employeeRepository: EmployeeRepository) {

    fun execute(): Flow<List<Employee>> = employeeRepository.getAllEmployees()
}