package ru.ramozjikevic.mymap.di.module.rx

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class SchedulersProviderImpl @Inject constructor() : SchedulersProvider {
    override fun io(): Scheduler = Schedulers.io()
    override fun main(): Scheduler = AndroidSchedulers.mainThread()
    override fun computation(): Scheduler = Schedulers.computation()
}
