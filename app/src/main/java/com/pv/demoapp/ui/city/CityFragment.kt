package com.pv.demoapp.ui.city

import android.os.Bundle
import android.view.View
import com.base.BaseFragment
import com.base.OnItemClick
import com.pv.demoapp.BR
import com.pv.demoapp.R
import com.pv.demoapp.data.model.City
import com.pv.demoapp.databinding.FragmentCityBinding
import com.pv.demoapp.ui.city.adapter.CityAdapter
import com.pv.demoapp.ui.interview.InterviewFragment
import com.pv.demoapp.utils.event.EventNextMain
import com.pv.demoapp.utils.postNormal
import org.koin.android.viewmodel.ext.android.viewModel

class CityFragment : BaseFragment<FragmentCityBinding, CityViewModel>(), CityNavigator {

    private val cityViewModel by viewModel<CityViewModel>()

    private val cityAdapter by lazy { CityAdapter() }

    override fun getBindingVariable(): Int = BR.cityModel

    override fun getLayoutId(): Int = R.layout.fragment_city

    override fun getViewModel(): CityViewModel = cityViewModel

    override fun updateUI(savedInstanceState: Bundle?) {
        cityViewModel.setNavigator(this)
        setUpRcv(binding!!.rcvCity, cityAdapter)
        cityViewModel.getListCity()
        cityAdapter.onItemClick = object : OnItemClick {
            override fun onItemClickListener(view: View, position: Int) {
                toast(cityAdapter.listCity[position].name)
                postNormal(EventNextMain(InterviewFragment::class.java))
            }
        }
    }

    override fun getListCitySuccess(list: List<City>) {
        cityAdapter.setListCitys(list)
    }

    override fun getListCityFailed(msg: String) = toast(msg)

}