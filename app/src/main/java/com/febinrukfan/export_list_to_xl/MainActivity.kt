package com.febinrukfan.export_list_to_xl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.febinrukfan.export_list_to_xl.application.GlobalSpace
import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.databinding.ActivityMainBinding
import com.febinrukfan.export_list_to_xl.presentation.adapter.EmployeeAdapter
import com.febinrukfan.export_list_to_xl.presentation.viewmodel.MainActivityViewModel
import com.febinrukfan.export_list_to_xl.presentation.viewmodel.MainActivityViewModelFactory
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

        newEmployee = Employee(1,"Febin")
        mainActivityViewModel.addEmployee(newEmployee)

        initializeEmployeeList()
        displayEmployeeList()
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



