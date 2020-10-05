package ru.ramozjikevic.mymap.di.module.rx

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RxModule {

    @Binds
    @Singleton
    abstract fun provideSchedulers(schedulersProvider: SchedulersProviderImpl): SchedulersProvider
}