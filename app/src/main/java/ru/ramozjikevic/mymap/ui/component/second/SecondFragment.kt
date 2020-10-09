package ru.ramozjikevic.mymap.ui.component.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.android.support.AndroidSupportInjection
import ru.ramozjikevic.mymap.R
import ru.ramozjikevic.mymap.di.module.viewmodel.ViewModelFactory
import ru.ramozjikevic.mymap.ui.component.base.BaseFragment
import ru.ramozjikevic.mymap.ui.component.base.viewModels
import ru.ramozjikevic.mymap.ui.component.first.FirstViewModel
import javax.inject.Inject

class SecondFragment : BaseFragment<SecondViewModel>() {
    override val layout: Int = R.layout.fragment_second
    override val viewModel: SecondViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.loadTestData()
    }
}