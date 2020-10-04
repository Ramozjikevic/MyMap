package ru.ramozjikevic.mymap.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.ramozjikevic.mymap.ui.component.first.FirstFragment
import ru.ramozjikevic.mymap.ui.component.second.SecondFragment


@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeFirstModule() : FirstFragment

    @ContributesAndroidInjector
    abstract fun contributeSecondModule() : SecondFragment

}
