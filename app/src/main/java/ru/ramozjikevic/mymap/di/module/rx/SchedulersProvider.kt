package ru.ramozjikevic.mymap.di.module.rx

import io.reactivex.Scheduler


interface SchedulersProvider {
    fun io(): Scheduler
    fun main(): Scheduler
    fun computation(): Scheduler
}