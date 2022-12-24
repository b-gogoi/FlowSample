package com.aibi.flowsample.data.local

import com.aibi.flowsample.data.local.entity.User
import kotlinx.coroutines.flow.Flow

interface DatabaseHelper {
    fun getUsers(): Flow<List<User>>

    fun insertAll(users: List<User>): Flow<Unit>
}