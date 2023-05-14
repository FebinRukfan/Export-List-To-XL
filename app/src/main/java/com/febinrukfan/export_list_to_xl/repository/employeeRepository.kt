package com.febinrukfan.export_list_to_xl.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.febinrukfan.export_list_to_xl.model.EmployeeTableModel
import com.febinrukfan.export_list_to_xl.room.EmployeeDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class employeeRepository() {

        companion object {

            var employeeDatabase: EmployeeDatabase? = null

            var employeeTableModel: LiveData<EmployeeTableModel>? = null

            fun initializeDB(context: Context): EmployeeDatabase {
                return EmployeeDatabase.getDataBaseClient(context)
            }

            fun insertData(context: Context, EmpName: String) {

                employeeDatabase = initializeDB(context)

                CoroutineScope(Dispatchers.IO).launch {
                    val loginDetails = EmployeeTableModel(EmpName = EmpName)
                    employeeDatabase!!.employeeDao().insert(loginDetails)
                }

            }

        }
    }

