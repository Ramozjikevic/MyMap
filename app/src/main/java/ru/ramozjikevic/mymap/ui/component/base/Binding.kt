package ru.ramozjikevic.mymap.ui.component.base

import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState

abstract class Binding {
    abstract fun bind(data: IViewModelState)

    //val delegates = mutableMapOf<String, RenderProp<out Any>>()
    //fun rebind() = delegates.forEach { it.value.bind() }

}