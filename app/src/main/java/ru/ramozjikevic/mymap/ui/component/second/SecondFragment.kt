package ru.ramozjikevic.mymap.ui.component.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import dagger.android.support.AndroidSupportInjection
import ru.ramozjikevic.mymap.R
import ru.ramozjikevic.mymap.di.module.viewmodel.ViewModelFactory
import ru.ramozjikevic.mymap.ui.component.base.BaseFragment
import javax.inject.Inject

class SecondFragment : BaseFragment() {
    override val layout: Int = R.layout.fragment_second

    @Inject
    internal lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rootViewModel: SecondViewModel by viewModels {
            viewModelFactory
        }

        rootViewModel.loadTestData()
    }
}