package com.ruland.davidr.radio.myradio.screens.splashscreen.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ruland.davidr.radio.R
import com.ruland.davidr.radio.myradio.screens.splashscreen.entity.Channel

class ChannelAdapter (private val contexte: Context) : RecyclerView.Adapter<ChannelAdapter.ChannelViewHolder>() {

    private var channels: List<Channel>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChannelViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.listchannels, parent, false)
        return ChannelViewHolder(v)
    }

    override fun getItemCount(): Int {
        return  if (channels != null) channels!!.size else 0
    }

    override fun onBindViewHolder(holder: ChannelViewHolder, position: Int) {
        val current = channels!![position]
        holder.wordItemView.text = current.channelName
    }

    internal fun setChannels(ch: List<Channel>) {
        channels = ch
        notifyDataSetChanged()
    }

    class ChannelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal val wordItemView: TextView = itemView.findViewById(R.id.textView)
    }
}