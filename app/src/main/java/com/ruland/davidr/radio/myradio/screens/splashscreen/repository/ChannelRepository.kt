package com.ruland.davidr.radio.myradio.screens.splashscreen.repository

import android.app.Application
import android.arch.lifecycle.LiveData
import android.os.AsyncTask
import android.support.annotation.WorkerThread
import com.ruland.davidr.radio.myradio.screens.splashscreen.dao.ListChannelDao
import com.ruland.davidr.radio.myradio.screens.splashscreen.database.AppDataBase
import com.ruland.davidr.radio.myradio.screens.splashscreen.entity.Channel

class ChannelRepository (application: Application) {
    var mChannelDao: ListChannelDao? = null
    var mAllChannels: LiveData<List<Channel>>? = null

    init {
        val db = AppDataBase.getDatabase(application)
        mChannelDao  = db!!.listCDao()
        mAllChannels = mChannelDao!!.getAllChannels()
    }

    internal fun getAllWords(): LiveData<List<Channel>> {
        return mAllChannels!!
    }

    fun insert(channel: Channel) {
        insertAsync(mChannelDao!!).execute(channel)
    }


    private class insertAsync internal constructor(private val mAsyncTaskDao: ListChannelDao) : AsyncTask<Channel, Void, Void>() {

        override fun doInBackground(vararg params: Channel): Void? {
            mAsyncTaskDao.insert(params[0])
            return null
        }
    }
}