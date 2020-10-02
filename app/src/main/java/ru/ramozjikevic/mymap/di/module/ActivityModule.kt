package ru.ramozjikevic.mymap.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.ramozjikevic.mymap.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector()
    abstract fun contributeMainActivity() : MainActivity
}