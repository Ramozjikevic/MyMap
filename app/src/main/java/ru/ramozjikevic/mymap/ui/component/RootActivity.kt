package ru.ramozjikevic.mymap.ui.component

import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment

import androidx.lifecycle.ViewModelProvider
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import ru.ramozjikevic.mymap.R
import ru.ramozjikevic.mymap.ui.component.base.BaseActivity
import javax.inject.Inject

class RootActivity : BaseActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    internal lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }

    override val layout: Int = R.layout.activity_root

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        val rootViewModel: RootViewModel by viewModels {
            viewModelFactory
        }

        rootViewModel.loadMoreTestData()
    }
}