package ru.ramozjikevic.mymap.ui.component.second

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PageKeyedDataSource
import androidx.paging.PagedList
import io.reactivex.disposables.CompositeDisposable
import ru.ramozjikevic.mymap.data.remote.models.CharactersRes
import ru.ramozjikevic.mymap.di.module.rx.SchedulersProvider
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.BaseRxViewModel
import ru.ramozjikevic.mymap.ui.component.base.viewmodel.IViewModelState
import javax.inject.Inject
import kotlin.math.log

class SecondViewModel @Inject constructor(
    override val schedulers: SchedulersProvider,
    private val testInteractor: TestInteractor,
) :  BaseRxViewModel<SecondState>(SecondState()) {

    val list: LiveData<PagedList<CharactersRes>>

    init {
        Log.e("123123 SecondViewModel", "init")

        val sourceFactory = SecondDataSourceFactory(disposes, testInteractor)
        val config = PagedList.Config.Builder()
            .setPageSize(10)
            .setEnablePlaceholders(false)
            .build()
        list = LivePagedListBuilder(sourceFactory, config).build()
    }





    fun loadTestData() {
/*        testInteractor.getCharacters()
            .bindSubscription(
                onSuccess = { list ->
                    Log.e("123123", "$list")
                    updateStateAsync { it.copy(character = list) }
                },
                onError = {
                    Log.e("123123", "error")
                }
            )*/
    }
}

data class SecondState(
    val character: List<CharactersRes> = listOf()
) : IViewModelState