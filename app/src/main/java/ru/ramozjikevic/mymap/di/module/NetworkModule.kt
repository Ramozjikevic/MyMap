package ru.ramozjikevic.mymap.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import ru.ramozjikevic.mymap.data.remote.RestService
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRestService() : RestService = createRetrofit().create(RestService::class.java)

    private fun createRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(createClient())
            .addCallAdapterFactory(createRxAdapter())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun createRxAdapter() : RxJava2CallAdapterFactory = RxJava2CallAdapterFactory.create()

    private fun createClient() : OkHttpClient = OkHttpClient.Builder().build()

    companion object {
        const val BASE_URL = "https://www.anapioficeandfire.com/api/"
    }
}