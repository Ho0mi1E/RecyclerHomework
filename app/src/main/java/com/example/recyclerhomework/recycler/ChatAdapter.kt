package com.example.recyclerhomework.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(private val clicker : Clicker) : RecyclerView.Adapter<ChatViewHolder>() {

    private var list: List<Country> = emptyList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder.newInstance(parent,clicker)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun submitList(data: List<Country>){
        list = data
        notifyDataSetChanged()
    }
}