package ru.ramozjikevic.mymap.ui.component.base.viewmodel

import androidx.lifecycle.ViewModel
import io.reactivex.*
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import ru.ramozjikevic.mymap.di.module.rx.SchedulersProvider

abstract class RxViewModel : ViewModel() {

    protected abstract val schedulers: SchedulersProvider

    private val disposes = CompositeDisposable()

    private val onCompleteStub: () -> Unit = {}
    private val onErrorStub: (Throwable) -> Unit = {}
    private val onSubscribeStub: (Disposable) -> Unit = {}

    protected fun <T> Single<T>.bindSubscriptionAsync(
        onSuccess: (T) -> Unit,
        onError: (Throwable) -> Unit = onErrorStub,
        onSubscribe: (Disposable) -> Unit = onSubscribeStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .doOnSubscribe(onSubscribe)
        .subscribe(onSuccess, onError)
        .bind()

    protected fun Completable.bindSubscriptionAsync(
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        onSubscribe: (Disposable) -> Unit = onSubscribeStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .doOnSubscribe(onSubscribe)
        .subscribe(onComplete, onError)
        .bind()

    protected fun <T> Observable<T>.bindSubscriptionAsync(
        onNext: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        onSubscribe: (Disposable) -> Unit = onSubscribeStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .subscribe(onNext, onError, onComplete, onSubscribe)
        .bind()

    protected fun <T> Flowable<T>.bindSubscriptionAsync(
        onNext: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .subscribe(onNext, onError, onComplete)
        .bind()

    protected fun <T> Maybe<T>.bindSubscriptionAsync(
        onSuccess: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .subscribe(onSuccess, onError, onComplete)
        .bind()

    private fun Disposable.bind() = disposes.add(this)

    override fun onCleared() {
        super.onCleared()
        disposes.dispose()
    }
}


