package com.febinrukfan.export_list_to_xl.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.domain.usecases.AddEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.DeleteEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.GetAllEmployeeUC
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val addEmployeeUseCase: AddEmployeeUC,
    private val deleteEmployeeUseCase: DeleteEmployeeUC,
    private val getAllEmployeeUseCase: GetAllEmployeeUC
) : ViewModel(){

    init{
        Log.i("MainActivity_","initiated...")
    }

    fun addEmployee(employee: Employee) = viewModelScope.launch(Dispatchers.IO) {
        addEmployeeUseCase.execute(employee)
    }

    fun deleteEmployee(employee: Employee) = viewModelScope.launch(Dispatchers.IO) {
        deleteEmployeeUseCase.execute(employee)
    }

    val allEmployeeDta: LiveData<List<Employee>> = getAllEmployeeUseCase.execute().asLiveData()


}
