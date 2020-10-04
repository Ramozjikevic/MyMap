package ru.ramozjikevic.mymap.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.ramozjikevic.mymap.ui.component.RootActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector()
    abstract fun contributeRootActivity() : RootActivity
}