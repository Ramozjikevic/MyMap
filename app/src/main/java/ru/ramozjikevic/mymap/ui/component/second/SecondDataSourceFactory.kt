package ru.ramozjikevic.mymap.ui.component.second

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import io.reactivex.disposables.CompositeDisposable
import ru.ramozjikevic.mymap.data.remote.models.CharactersRes
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor

class SecondDataSourceFactory(
    private val compositeDisposable: CompositeDisposable,
    private val testInteractor: TestInteractor
) : DataSource.Factory<Long, CharactersRes>() {

    private val secondLiveDataSource = MutableLiveData<SecondDataSource>()

    override fun create(): DataSource<Long, CharactersRes> {
        val dataSource = SecondDataSource(compositeDisposable, testInteractor)
        secondLiveDataSource.postValue(dataSource)
        return dataSource
    }
}