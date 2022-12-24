package com.aibi.flowsample.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.aibi.flowsample.data.local.entity.User

@Dao
interface UserDao {

    @Query("SELECT * from user")
    fun getAll(): List<User>

    @Insert
    fun insertAll(users: List<User>)

    @Delete
    fun delete(user: User)

}