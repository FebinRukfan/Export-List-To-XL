package com.febinrukfan.export_list_to_xl.presentation.di

import com.febinrukfan.export_list_to_xl.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, DatabaseModule::class, DatasourceModule::class,
            RepositoryModule::class, UseCaseModule::class, ViewModelModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}