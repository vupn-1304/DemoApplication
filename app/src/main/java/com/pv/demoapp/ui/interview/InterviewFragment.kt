package com.pv.demoapp.ui.interview

import android.os.Bundle
import com.base.BaseFragment
import com.pv.demoapp.BR
import com.pv.demoapp.R
import com.pv.demoapp.databinding.FragmentInterviewBinding
import org.koin.android.viewmodel.ext.android.viewModel

class InterviewFragment : BaseFragment<FragmentInterviewBinding, InterviewViewModel>(), InterviewNavigator {

    private val interviewViewModel by viewModel<InterviewViewModel>()

    override fun getBindingVariable(): Int = BR.interviewModel

    override fun getLayoutId(): Int = R.layout.fragment_interview

    override fun getViewModel(): InterviewViewModel = interviewViewModel

    override fun updateUI(savedInstanceState: Bundle?) {
        interviewViewModel.setNavigator(this)
    }

    override fun downloadMusic() {
        toast("Download Music")
    }
}