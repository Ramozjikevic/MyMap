package ru.ramozjikevic.mymap.ui.component


import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import ru.ramozjikevic.mymap.R
import ru.ramozjikevic.mymap.ui.component.base.BaseActivity
import ru.ramozjikevic.mymap.ui.component.base.viewModels

class RootActivity : BaseActivity<RootViewModel>(), HasSupportFragmentInjector {

    override val layout: Int = R.layout.activity_root
    override val viewModel: RootViewModel by viewModels()

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.get()
    }
}