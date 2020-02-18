package com.pv.demoapp.ui.interview

import com.pv.demoapp.base.BaseViewModel
import com.pv.demoapp.data.DataManager
import com.utils.SchedulerProvider

class InterviewViewModel(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
) : BaseViewModel<InterviewNavigator>(dataManager, schedulerProvider) {

    fun backgroudService() = getNavigator().downloadMusic()
}