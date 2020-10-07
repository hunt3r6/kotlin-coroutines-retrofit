package co.id.bismalabs.kotlincoroutinesretrofit.data.api

class ApiHelper (private val apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}