package ru.ramozjikevic.mymap.data.remote

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ru.ramozjikevic.mymap.data.remote.models.CharactersRes

interface RestService {
    @GET("characters")
    fun getCharacters(
        @Query("page") page: Long,
        @Query("pageSize") pageSize: Int
    ) : Single<List<CharactersRes>>
}