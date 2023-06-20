package com.febinrukfan.export_list_to_xl.presentation.di

import com.febinrukfan.export_list_to_xl.data.datasource.LocalDataSource
import com.febinrukfan.export_list_to_xl.data.datasource_impl.LocalDataSourceImpl
import com.febinrukfan.export_list_to_xl.data.db.EmployeeDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatasourceModule {

    @Singleton
    @Provides
    fun providesLocaldatasource(empDao : EmployeeDao) : LocalDataSource {
        return LocalDataSourceImpl(empDao)
    }
}