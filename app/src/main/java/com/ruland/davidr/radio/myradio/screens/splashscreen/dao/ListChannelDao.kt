package com.ruland.davidr.radio.myradio.screens.splashscreen.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import android.arch.persistence.room.Insert
import com.ruland.davidr.radio.myradio.screens.splashscreen.entity.Channel
@Dao
interface ListChannelDao {
    @Query("SELECT * FROM list_channels")
    fun getAllChannels(): LiveData<List<Channel>>

    @Insert
    fun insert(channel: Channel)
}
