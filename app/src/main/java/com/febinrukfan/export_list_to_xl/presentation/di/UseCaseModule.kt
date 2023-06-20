package com.febinrukfan.export_list_to_xl.presentation.di

import com.febinrukfan.export_list_to_xl.domain.repository.EmployeeRepository
import com.febinrukfan.export_list_to_xl.domain.usecases.AddEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.DeleteEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.GetAllEmployeeUC
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun providesAddEmployeeUseCase(employeeRepository: EmployeeRepository): AddEmployeeUC {
        return AddEmployeeUC(employeeRepository)
    }

    @Singleton
    @Provides
    fun providesDeleteEmployeeUseCase(employeeRepository: EmployeeRepository): DeleteEmployeeUC {
        return DeleteEmployeeUC(employeeRepository)
    }

    @Singleton
    @Provides
    fun providesGetAllEmployeeUseCase(employeeRepository: EmployeeRepository): GetAllEmployeeUC {
        return GetAllEmployeeUC(employeeRepository)
    }
}