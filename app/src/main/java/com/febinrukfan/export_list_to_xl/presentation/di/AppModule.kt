package com.febinrukfan.export_list_to_xl.presentation.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(private val context : Context) {

    @Singleton
    @Provides
    fun provideAppContext() : Context{
        return context.applicationContext
    }
}