package com.pv.demoapp.ui

import android.os.Bundle
import android.os.Handler
import com.core.BaseActivity
import com.event.EventNextFragment
import com.pv.demoapp.R
import com.pv.demoapp.ui.register.RegisterFragment
import com.utils.ext.register
import com.utils.ext.unregister
import org.greenrobot.eventbus.Subscribe

class MainActivity : BaseActivity() {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun updateUI(savedInstanceState: Bundle?) {
        openFragment(R.id.container_main, RegisterFragment::class.java, null, false)
    }

    override fun onStart() {
        super.onStart()
        register(this)
    }

    override fun onStop() {
        super.onStop()
        unregister(this)
    }

    @Subscribe
    fun onEventNextMain(nextFragment: EventNextFragment) {
        Handler().post {
            openFragment(R.id.container_main, nextFragment.clazz, nextFragment.bundle, nextFragment.isAddToBackStack)
        }
    }

    override fun onBackPressed() {
        val curr = supportFragmentManager.findFragmentById(R.id.container_main)
//        if (curr is WelcomeFragment) {
//            finish()
//            return
//        }
        super.onBackPressed()
    }
}
