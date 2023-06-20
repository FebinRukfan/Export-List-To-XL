package com.febinrukfan.export_list_to_xl.presentation.di

import com.febinrukfan.export_list_to_xl.data.EmployeeDatabaseImpl
import com.febinrukfan.export_list_to_xl.data.datasource.LocalDataSource
import com.febinrukfan.export_list_to_xl.domain.repository.EmployeeRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

   @Singleton
   @Provides
   fun providesEmpRepository(localDataSource : LocalDataSource) : EmployeeRepository {
       return EmployeeDatabaseImpl(localDataSource)
   }
}