package com.febinrukfan.export_list_to_xl.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.febinrukfan.export_list_to_xl.repository.employeeRepository

class employeeViewModel : ViewModel(){

    fun insertData(context: Context, employee_name: String) {
        employeeRepository.insertData(context, employee_name)
    }

}