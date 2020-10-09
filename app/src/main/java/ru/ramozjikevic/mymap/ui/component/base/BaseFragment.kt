package ru.ramozjikevic.mymap.ui.component.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.android.support.AndroidSupportInjection
import ru.ramozjikevic.mymap.di.module.viewmodel.ViewModelFactory
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState
import javax.inject.Inject

abstract class BaseFragment<T : BaseRxViewModel<out IViewModelState>> : Fragment() {
    protected abstract val layout: Int
    protected abstract val viewModel: T
    open val binding : Binding? = null

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(layout, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.observeState(viewLifecycleOwner) {
            binding?.bind(it)
        }
    }
}

inline fun <reified T : BaseRxViewModel<out IViewModelState>> BaseFragment<T>.viewModels(
) = viewModels<T> { viewModelFactory }