package com.febinrukfan.export_list_to_xl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.febinrukfan.export_list_to_xl.application.GlobalSpace
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




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindingObj = DataBindingUtil.setContentView(this, R.layout.activity_main)
        (application as GlobalSpace).getAppComponentInstance().inject(this)
        mainActivityViewModel =
            ViewModelProvider(this, mainActivityViewModelFactory)[MainActivityViewModel::class.java]
//        bindingObj.fabBtn.setOnClickListener {
//            val intent = Intent(this@MainActivity, AddEmployeeActivity::class.java)
//            getResult.launch(intent)
//        }
//        initialiseRecyclerVw()
//        displayEmployeeData()
    }


}



