package ru.ramozjikevic.mymap.ui.component.base

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import ru.ramozjikevic.mymap.R
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState
import javax.inject.Inject

abstract class BaseActivity<T : BaseRxViewModel<out IViewModelState>> : AppCompatActivity() {
    protected abstract val layout: Int
    protected abstract val viewModel: T

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(layout)
        navController = findNavController(R.id.nav_host_fragment)
    }
}

inline fun <reified T : BaseRxViewModel<out IViewModelState>> BaseActivity<T>.viewModels(
) = viewModels<T> { viewModelFactory }

