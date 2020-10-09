package ru.ramozjikevic.mymap.di.module

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import ru.ramozjikevic.mymap.data.local.DataBase
import ru.ramozjikevic.mymap.data.local.dao.TestDao
import javax.inject.Singleton

@Module
class DataBaseModule {
    @Provides
    @Singleton
    internal fun provideDatabase(application: Application): DataBase {
        return Room.databaseBuilder(
            application, DataBase::class.java, "Experemental.db"
        )
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    internal fun provideTestDao(appDataBase: DataBase): TestDao {
        return appDataBase.testDao()
    }

}