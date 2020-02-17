package com.pv.demoapp.ui.city

import com.pv.demoapp.base.BaseViewModel
import com.pv.demoapp.data.DataManager
import com.utils.SchedulerProvider

class CityViewModel(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider) : BaseViewModel<CityNavigator>(dataManager,schedulerProvider){
}