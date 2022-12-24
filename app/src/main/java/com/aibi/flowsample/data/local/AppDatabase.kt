package com.aibi.flowsample.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aibi.flowsample.data.local.dao.UserDao
import com.aibi.flowsample.data.local.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}