package com.ruland.davidr.radio.myradio.screens.splashscreen.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.ruland.davidr.radio.myradio.screens.splashscreen.dao.ListChannelDao
import com.ruland.davidr.radio.myradio.screens.splashscreen.entity.Channel


@Database(entities = [(Channel::class)], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun listCDao():ListChannelDao

    companion object {
        @Volatile
        private var INSTANCE: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDataBase::class.java,
                        "Word_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
