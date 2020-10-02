package ru.ramozjikevic.mymap.di.rx

import dagger.Module
import dagger.Provides
import ru.ramozjikevic.mymap.di.rx.SchedulersProvider
import ru.ramozjikevic.mymap.di.rx.SchedulersProviderImpl
import javax.inject.Singleton

@Module
class RxTreadModule {

    @Singleton
    @Provides
    fun provideSchedulers() : SchedulersProvider = SchedulersProviderImpl()
}