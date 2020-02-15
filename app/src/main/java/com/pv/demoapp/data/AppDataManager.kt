package com.pv.demoapp.data

import com.pv.demoapp.data.remote.ApiHelper

class AppDataManager constructor(
        private val apiHelper: ApiHelper
) : DataManager {

    override fun getCity() = apiHelper.getCity()

    override fun getDistrict() = apiHelper.getDistrict()
}