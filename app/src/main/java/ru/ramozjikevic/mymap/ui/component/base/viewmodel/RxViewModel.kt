package ru.ramozjikevic.mymap.ui.component.base.viewmodel

/*abstract class RxViewModel() : ViewModel() {
    @Inject
    lateinit var schedulers: SchedulersProvider

    private val disposes = CompositeDisposable()

    private val onCompleteStub: () -> Unit = {}
    private val onErrorStub: (Throwable) -> Unit = {}
    private val onSubscribeStub: (Disposable) -> Unit = {}

    protected fun <T> Single<T>.bindSubscriptionAsync(
        onSuccess: (T) -> Unit,
        onError: (Throwable) -> Unit = onErrorStub,
        onSubscribe: (Disposable) -> Unit = onSubscribeStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main(),
        unsubscribeOn: Scheduler = schedulers.io()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .unsubscribeOn(unsubscribeOn)
        .doOnSubscribe(onSubscribe)
        .subscribe(onSuccess, onError)
        .bind()

  *//*  protected abstract val schedulers: SchedulersProvider

    protected fun <T> Single<T>.bindSubscription(
        onSuccess: (T) -> Unit,
        onError: (Throwable) -> Unit = onErrorStub
    ) = subscribe(onSuccess, onError).bind()

    protected fun Completable.bindSubscription(
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub
    ) = subscribe(onComplete, onError).bind()

*//**//*    protected fun <T> Observable<T>.bindSubscription(
        onNext: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        onSubscribe: (Disposable) -> Unit = onSubscribeStub
    ) = subscribe(onNext, onError, onComplete, onSubscribe).bind()*//**//*

    protected fun <T> Flowable<T>.bindSubscription(
        onNext: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub
    ) = subscribe(onNext, onError, onComplete).bind()

    protected fun <T> Maybe<T>.bindSubscription(
        onSuccess: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub
    ) = subscribe(onSuccess, onError, onComplete).bind()

    protected fun <T> Single<T>.bindSubscriptionAsync(
        onSuccess: (T) -> Unit,
        onError: (Throwable) -> Unit = onErrorStub,
        onSubscribe: (Disposable) -> Unit = onSubscribeStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main(),
        unsubscribeOn: Scheduler = schedulers.io()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .unsubscribeOn(unsubscribeOn)
        .doOnSubscribe(onSubscribe)
        .subscribe(onSuccess, onError)
        .bind()

    protected fun Completable.bindSubscriptionAsync(
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        onSubscribe: (Disposable) -> Unit = onSubscribeStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main(),
        unsubscribeOn: Scheduler = schedulers.io()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .unsubscribeOn(unsubscribeOn)
        .doOnSubscribe(onSubscribe)
        .subscribe(onComplete, onError).bind()

*//**//*    protected fun <T> Observable<T>.bindSubscriptionAsync(
        onNext: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        onSubscribe: (Disposable) -> Unit = onSubscribeStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main(),
        unsubscribeOn: Scheduler = schedulers.io()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .unsubscribeOn(unsubscribeOn)
        .subscribe(onNext, onError, onComplete, onSubscribe)
        .bind()*//**//*

    protected fun <T> Flowable<T>.bindSubscriptionAsync(
        onNext: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main(),
        unsubscribeOn: Scheduler = schedulers.io()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .unsubscribeOn(unsubscribeOn)
        .subscribe(onNext, onError, onComplete)
        .bind()

    protected fun <T> Maybe<T>.bindSubscriptionAsync(
        onSuccess: (T) -> Unit,
        onComplete: () -> Unit = onCompleteStub,
        onError: (Throwable) -> Unit = onErrorStub,
        subscribeOn: Scheduler = schedulers.io(),
        observeOn: Scheduler = schedulers.main(),
        unsubscribeOn: Scheduler = schedulers.io()
    ) = subscribeOn(subscribeOn)
        .observeOn(observeOn)
        .unsubscribeOn(unsubscribeOn)
        .subscribe(onSuccess, onError, onComplete)
        .bind()*//*


    private fun Disposable.bind() = disposes.add(this)

    override fun onCleared() {
        super.onCleared()
        disposes.dispose()
    }
}*/


