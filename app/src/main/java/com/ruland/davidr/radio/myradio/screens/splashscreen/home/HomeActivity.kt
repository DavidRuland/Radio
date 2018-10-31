package com.ruland.davidr.radio.myradio.screens.splashscreen.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ruland.davidr.radio.R
import com.ruland.davidr.radio.myradio.screens.splashscreen.database.AppDataBase
import android.arch.persistence.room.Room
import com.ruland.davidr.radio.myradio.screens.splashscreen.dao.ListChannelDao
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.ruland.davidr.radio.myradio.screens.splashscreen.adapter.ChannelAdapter
import com.ruland.davidr.radio.myradio.screens.splashscreen.entity.Channel
import com.ruland.davidr.radio.myradio.screens.splashscreen.viewmodel.ChannelViewModel

class HomeActivity : AppCompatActivity() {
    private var mChannelViewModel: ChannelViewModel? = null
    private var channel:Channel?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        channel= Channel("","","","")


       // val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        //val adapter = ChannelAdapter(this)
       // recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = adapter
        //mChannelViewModel = ViewModelProviders.of(this).get(ChannelViewModel::class.java)
        //mChannelViewModel!!.getAllChannels().observe(this, Observer<List<Channel>> { t -> adapter.setChannels(t!!) })

    }
}

