package ru.ramozjikevic.mymap.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.ramozjikevic.mymap.ui.component.RootActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeRootActivity() : RootActivity
}