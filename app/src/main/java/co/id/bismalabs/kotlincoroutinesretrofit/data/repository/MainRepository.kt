package co.id.bismalabs.kotlincoroutinesretrofit.data.repository

import co.id.bismalabs.kotlincoroutinesretrofit.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}