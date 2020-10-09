package ru.ramozjikevic.mymap.data.remote

import io.reactivex.Single
import retrofit2.http.GET
import ru.ramozjikevic.mymap.data.remote.models.CharactersRes

interface RestService {
    @GET("characters")
    fun getCharacters() : Single<List<CharactersRes>>
}