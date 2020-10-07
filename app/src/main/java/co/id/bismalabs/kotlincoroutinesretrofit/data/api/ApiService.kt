package co.id.bismalabs.kotlincoroutinesretrofit.data.api

import co.id.bismalabs.kotlincoroutinesretrofit.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}