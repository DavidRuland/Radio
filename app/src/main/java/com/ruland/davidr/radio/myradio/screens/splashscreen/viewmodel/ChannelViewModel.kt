package com.ruland.davidr.radio.myradio.screens.splashscreen.viewmodel

import android.app.Application
import android.app.job.JobParameters
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.view.KeyEvent
import com.ruland.davidr.radio.R
import com.ruland.davidr.radio.myradio.screens.splashscreen.database.AppDataBase
import com.ruland.davidr.radio.myradio.screens.splashscreen.entity.Channel
import com.ruland.davidr.radio.myradio.screens.splashscreen.repository.ChannelRepository
import kotlin.coroutines.experimental.CoroutineContext

class ChannelViewModel (application: Application):AndroidViewModel(application){
    internal var mRepository: ChannelRepository? = null
    internal var allChannels: LiveData<List<Channel>>? = null

    init {
        mRepository = ChannelRepository(application)
        allChannels = mRepository!!.getAllWords()
    }

    fun getAllChannels(): LiveData<List<Channel>> {  return allChannels!!}

    fun insert(channel: Channel) {        mRepository!!.insert(channel)
    }
}


