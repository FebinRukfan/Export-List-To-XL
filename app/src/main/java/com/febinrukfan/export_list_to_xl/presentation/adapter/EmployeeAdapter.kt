package com.febinrukfan.export_list_to_xl.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.febinrukfan.export_list_to_xl.R
import com.febinrukfan.export_list_to_xl.data.model.Employee
import com.febinrukfan.export_list_to_xl.databinding.EmployeeItemBinding

class EmployeeAdapter : RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {

    private var employeeList  = ArrayList<Employee>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bindingObject:EmployeeItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.employee_item,parent,false)
        return ViewHolder(bindingObject)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindView(employeeList[position])

    }

    override fun getItemCount(): Int {
        return employeeList.size
    }

    fun setEmployeeList(employeeLst:List<Employee>){
        employeeList.clear()
        employeeList.addAll(employeeLst)
        notifyDataSetChanged()
    }


    fun getEmployee(position: Int):Employee{
        return employeeList[position]
    }

    // Holds the views for adding it to image and text
    inner class ViewHolder(private val empListItemBinding: EmployeeItemBinding) : RecyclerView.ViewHolder(empListItemBinding.root) {
       fun bindView(employee: Employee){
           empListItemBinding.rvEmpName.text = employee.EmpName
           empListItemBinding.rvEmpId.text = employee.EmpID.toString()
       }
    }


}
