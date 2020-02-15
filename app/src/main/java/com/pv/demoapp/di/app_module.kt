package com.pv.demoapp.di

import com.google.gson.GsonBuilder
import com.pv.demoapp.data.AppDataManager
import com.pv.demoapp.data.DataManager
import com.pv.demoapp.data.remote.ApiHelper
import com.pv.demoapp.data.remote.AppApiHelper
import com.utils.SchedulerProvider
import org.koin.core.module.Module
import org.koin.dsl.module


//define app module gson, data manager, etc...
val appModule: Module = module {

    single { SchedulerProvider() }

    single { AppDataManager(get()) as DataManager }

    single { AppApiHelper() as ApiHelper }

    single {
        GsonBuilder().excludeFieldsWithoutExposeAnnotation().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'X'").create()!!
    }
}
val demoModule = listOf(appModule, viewModule)
