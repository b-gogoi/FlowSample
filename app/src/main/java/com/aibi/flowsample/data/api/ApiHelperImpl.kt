package com.aibi.flowsample.data.api

import com.aibi.flowsample.data.model.Users
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override fun getUsers(): Flow<List<Users>> = flow { emit(apiService.getUsers()) }

    override fun getMoreUsers(): Flow<List<Users>> = flow { emit(apiService.getMoreUsers()) }

    override fun getUsersWithError(): Flow<List<Users>> = flow { emit(apiService.getUsersWithError()) }
}