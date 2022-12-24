package com.aibi.flowsample.data.api

import com.aibi.flowsample.data.model.Users
import kotlinx.coroutines.flow.Flow

interface ApiHelper {
    fun getUsers(): Flow<List<Users>>

    fun getMoreUsers(): Flow<List<Users>>

    fun getUsersWithError(): Flow<List<Users>>
}