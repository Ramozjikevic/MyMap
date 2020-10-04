package ru.ramozjikevic.mymap.di.module.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.ramozjikevic.mymap.ui.component.RootViewModel
import ru.ramozjikevic.mymap.ui.component.first.FirstViewModel
import ru.ramozjikevic.mymap.ui.component.second.SecondViewModel

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(RootViewModel::class)
    protected abstract fun rootViewModel(activityViewModel: RootViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FirstViewModel::class)
    protected abstract fun firstViewModel(activityViewModel: FirstViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SecondViewModel::class)
    protected abstract fun secondViewModel(activityViewModel: SecondViewModel) : ViewModel
}