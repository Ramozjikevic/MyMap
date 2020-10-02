package ru.ramozjikevic.mymap.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import ru.ramozjikevic.mymap.App
import ru.ramozjikevic.mymap.di.module.ActivityModule
import ru.ramozjikevic.mymap.di.module.DataBaseModule
import ru.ramozjikevic.mymap.di.module.RepositoryModule
import ru.ramozjikevic.mymap.di.viewmodel.ViewModelModule
import javax.inject.Singleton


@Component(
    modules = [
        AndroidInjectionModule::class,
        DataBaseModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        RepositoryModule::class
    ]
)
@Singleton
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: App)
}