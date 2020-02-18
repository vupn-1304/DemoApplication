package com.pv.demoapp.ui.city

import android.os.Bundle
import com.base.BaseFragment
import com.pv.demoapp.BR
import com.pv.demoapp.R
import com.pv.demoapp.databinding.FragmentCityBinding
import com.pv.demoapp.ui.city.adapter.CityAdapter
import org.koin.android.viewmodel.ext.android.viewModel


class CityFragment : BaseFragment<FragmentCityBinding, CityViewModel>(), CityNavigator {

    private val cityViewModel by viewModel<CityViewModel>()

    private val cityAdapter by lazy { CityAdapter() }

    override fun getBindingVariable(): Int = BR.cityModel

    override fun getLayoutId(): Int = R.layout.fragment_city

    override fun getViewModel(): CityViewModel = cityViewModel

    override fun updateUI(savedInstanceState: Bundle?) {
        cityViewModel.setNavigator(this)
    }
}