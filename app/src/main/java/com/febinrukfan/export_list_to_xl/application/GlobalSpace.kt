package com.febinrukfan.export_list_to_xl.application

import android.app.Application
import com.febinrukfan.export_list_to_xl.presentation.di.AppComponent
import com.febinrukfan.export_list_to_xl.presentation.di.AppModule
import com.febinrukfan.export_list_to_xl.presentation.di.DaggerAppComponent


class GlobalSpace : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(applicationContext)).build()
    }

    fun getAppComponentInstance(): AppComponent = appComponent
}