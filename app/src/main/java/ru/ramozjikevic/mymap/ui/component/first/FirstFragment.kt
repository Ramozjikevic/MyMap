package ru.ramozjikevic.mymap.ui.component.first

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_first.*
import ru.ramozjikevic.mymap.R
import ru.ramozjikevic.mymap.di.module.viewmodel.ViewModelFactory
import ru.ramozjikevic.mymap.ui.component.base.BaseFragment
import ru.ramozjikevic.mymap.ui.component.base.viewModels
import javax.inject.Inject

class FirstFragment : BaseFragment<FirstViewModel>() {
    override val layout: Int = R.layout.fragment_first
    override val viewModel: FirstViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_click.setOnClickListener {
            findNavController().navigate(R.id.to_second_fragment)
        }
    }
}