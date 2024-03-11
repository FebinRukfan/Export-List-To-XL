package com.febinrukfan.export_list_to_xl.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.febinrukfan.export_list_to_xl.domain.usecases.AddEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.DeleteAllEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.DeleteEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.GetAllEmployeeUC

class MainActivityViewModelFactory(
    private val addEmployeeUseCase: AddEmployeeUC,
    private val deleteEmployeeUseCase: DeleteEmployeeUC,
    private val deleteAllEmployeeUseCase: DeleteAllEmployeeUC,
    private val getAllEmployeeUseCase: GetAllEmployeeUC

) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainActivityViewModel(addEmployeeUseCase,deleteEmployeeUseCase,deleteAllEmployeeUseCase,getAllEmployeeUseCase) as T
    }
}