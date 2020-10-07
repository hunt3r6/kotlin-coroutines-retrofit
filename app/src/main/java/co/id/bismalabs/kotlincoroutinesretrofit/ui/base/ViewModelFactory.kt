package co.id.bismalabs.kotlincoroutinesretrofit.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import co.id.bismalabs.kotlincoroutinesretrofit.data.api.ApiHelper
import co.id.bismalabs.kotlincoroutinesretrofit.data.repository.MainRepository
import co.id.bismalabs.kotlincoroutinesretrofit.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}