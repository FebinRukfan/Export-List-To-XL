package com.febinrukfan.export_list_to_xl.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.febinrukfan.export_list_to_xl.R
import com.febinrukfan.export_list_to_xl.viewmodel.employeeViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: employeeViewModel

    lateinit var context: Context


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        context = this@MainActivity


        viewModel = ViewModelProvider(this).get(employeeViewModel::class.java)


        val employeeNames = listOf("Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Isabelle", "James", "Kate", "Liam", "Mia", "Nathan", "Olivia", "Patrick", "Quinn", "Rachel", "Sophia", "Thomas")
        for (name in employeeNames) {
            viewModel.insertData(context,name)
        }
    }



}