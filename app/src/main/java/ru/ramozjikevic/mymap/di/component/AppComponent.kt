package ru.ramozjikevic.mymap.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import ru.ramozjikevic.mymap.App
import ru.ramozjikevic.mymap.di.module.ActivityModule
import ru.ramozjikevic.mymap.di.module.DataBaseModule
import ru.ramozjikevic.mymap.di.module.RepositoryModule
import ru.ramozjikevic.mymap.di.module.viewmodel.ViewModelModule
import javax.inject.Singleton


@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        DataBaseModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        /*FragmentModule::class,*/
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