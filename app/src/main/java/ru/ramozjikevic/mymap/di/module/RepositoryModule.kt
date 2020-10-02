package ru.ramozjikevic.mymap.di.module

import dagger.Binds
import dagger.Module
import ru.ramozjikevic.mymap.data.repository.TestRepository
import ru.ramozjikevic.mymap.data.repository.TestRepositoryImpl
import javax.inject.Singleton

@Module
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun provideTestRepository(testRepository: TestRepositoryImpl): TestRepository
}