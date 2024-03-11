package com.febinrukfan.export_list_to_xl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.febinrukfan.export_list_to_xl.application.GlobalSpace
import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.databinding.ActivityMainBinding
import com.febinrukfan.export_list_to_xl.presentation.adapter.EmployeeAdapter
import com.febinrukfan.export_list_to_xl.presentation.viewmodel.MainActivityViewModel
import com.febinrukfan.export_list_to_xl.presentation.viewmodel.MainActivityViewModelFactory
import kotlinx.coroutines.launch
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainActivityViewModelFactory: MainActivityViewModelFactory
    private lateinit var mainActivityViewModel: MainActivityViewModel
    private lateinit var bindingObj: ActivityMainBinding
    private lateinit var empAdapter: EmployeeAdapter

    private var newEmployee: Employee = Employee(null, "")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingObj = DataBindingUtil.setContentView(this, R.layout.activity_main)
        (application as GlobalSpace).getAppComponentInstance().inject(this)

        mainActivityViewModel =
            ViewModelProvider(this, mainActivityViewModelFactory)[MainActivityViewModel::class.java]



        addEmployeetoDB()
        initializeEmployeeList()
        displayEmployeeList()
    }

    private fun addEmployeetoDB() {

        val names = arrayListOf("Febin","Thomas","Suresh","Susan","Devika","Jins","David","Andrew","Martin","Josbin")

        mainActivityViewModel.deleteAllEmployee()

        for ((index, value) in names.withIndex()) {

            lifecycleScope.launch {

                newEmployee = Employee(index+1,value)
                mainActivityViewModel.addEmployee(newEmployee)

            }

        }



    }


    private fun initializeEmployeeList() {

        empAdapter = EmployeeAdapter()
        bindingObj.rvEmployees.apply {
            adapter = empAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun displayEmployeeList() {
        mainActivityViewModel.allEmployeeDta.observe(this) {
            empAdapter.setEmployeeList(it)
        }
    }

}



