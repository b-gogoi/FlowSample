package com.aibi.flowsample.data.api

import com.aibi.flowsample.data.model.Users
import retrofit2.http.GET

interface ApiService {
    @GET
    suspend fun getUsers(): List<Users>

    @GET
    suspend fun getMoreUsers(): List<Users>

    @GET
    suspend fun getUsersWithError(): List<Users>
}