package com.ruland.davidr.radio.myradio.screens.splashscreen.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "list_channels")
data class Channel(@ColumnInfo(name="category_name") var channelName: String,
                   @ColumnInfo (name= "song") var songName:String,
                   @ColumnInfo (name = "artist") var artist:String,
                   @ColumnInfo(name="id")
                   @PrimaryKey(autoGenerate = true) var id: String)
