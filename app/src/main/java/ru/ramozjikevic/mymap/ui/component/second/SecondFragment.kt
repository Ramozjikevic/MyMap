package ru.ramozjikevic.mymap.ui.component.second

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_second.*
import ru.ramozjikevic.mymap.R
import ru.ramozjikevic.mymap.ui.component.base.BaseFragment
import ru.ramozjikevic.mymap.ui.component.base.Binding
import ru.ramozjikevic.mymap.ui.component.base.viewModels
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState


class SecondFragment : BaseFragment<SecondViewModel>() {
    override val layout: Int = R.layout.fragment_second
    override val viewModel: SecondViewModel by viewModels()
    override val binding by lazy { SecondBind() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.loadTestData()
    }

    inner class SecondBind: Binding() {
        override fun bind(data: IViewModelState) {
            data as SecondState
            text.text = data.character.toString()
        }
    }
}