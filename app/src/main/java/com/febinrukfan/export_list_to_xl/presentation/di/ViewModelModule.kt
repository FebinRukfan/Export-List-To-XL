package com.febinrukfan.export_list_to_xl.presentation.di

import com.febinrukfan.export_list_to_xl.domain.usecases.AddEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.DeleteEmployeeUC
import com.febinrukfan.export_list_to_xl.domain.usecases.GetAllEmployeeUC
import com.febinrukfan.export_list_to_xl.presentation.viewmodel.MainActivityViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ViewModelModule {

    @Singleton
    @Provides
    fun providesMainActivityViewModelFactory(
        addEmployeeUseCase: AddEmployeeUC,
        deleteEmployeeUseCase: DeleteEmployeeUC,
        getAllEmployeeUseCase: GetAllEmployeeUC
    ): MainActivityViewModelFactory {
        return MainActivityViewModelFactory(addEmployeeUseCase,deleteEmployeeUseCase,getAllEmployeeUseCase)
    }

}