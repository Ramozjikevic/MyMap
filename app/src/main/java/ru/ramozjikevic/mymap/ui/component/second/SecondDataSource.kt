package ru.ramozjikevic.mymap.ui.component.second

import android.util.Log
import androidx.paging.PageKeyedDataSource
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ru.ramozjikevic.mymap.data.remote.models.CharactersRes
import ru.ramozjikevic.mymap.domain.interactors.TestInteractor

class SecondDataSource(
    private val compositeDisposable: CompositeDisposable,
    private val testInteractor: TestInteractor
) : PageKeyedDataSource<Long, CharactersRes>() {

    private var firstPage = 1L

    override fun loadInitial(
        params: LoadInitialParams<Long>,
        callback: LoadInitialCallback<Long, CharactersRes>
    ) {
        compositeDisposable.add(
            testInteractor.getCharacters(firstPage, params.requestedLoadSize)
                .subscribeOn(Schedulers.io())
                .subscribe(
                    {
                        callback.onResult(it, null, firstPage + 1)
                        Log.e("22222", "loadinitialSucces")
                    }, {
                        Log.e("22222", "loadinitialError")
                    }
                )
        )
    }


    override fun loadAfter(params: LoadParams<Long>, callback: LoadCallback<Long, CharactersRes>) {
        compositeDisposable.add(
            testInteractor.getCharacters(params.key + 1, params.requestedLoadSize)
                .subscribeOn(Schedulers.io())
                .subscribe(
                    {
                        callback.onResult(it,  params.key + 1)
                        Log.e("22222", "loadAfterSucces")
                    }, {
                        Log.e("22222", "loadAfterError")
                    }
                )
        )
    }

    override fun loadBefore(params: LoadParams<Long>, callback: LoadCallback<Long, CharactersRes>) {
    }

}