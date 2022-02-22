package com.example.recyclerhomework.recycler.presintation

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerhomework.recycler.domain.models.CountryForView

class ChatAdapter(private val clicker: Clicker) : RecyclerView.Adapter<ChatViewHolder>() {

    private var list: List<CountryForView> = emptyList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder.newInstance(parent, clicker)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun submitList(data: List<CountryForView>) {
        list = data
        notifyDataSetChanged()
    }
}