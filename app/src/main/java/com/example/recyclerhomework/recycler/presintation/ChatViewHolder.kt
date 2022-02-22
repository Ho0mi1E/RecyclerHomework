package com.example.recyclerhomework.recycler.presintation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerhomework.R
import com.example.recyclerhomework.recycler.domain.models.CountryForView


class ChatViewHolder(item: View, private val clickOn: Clicker) : RecyclerView.ViewHolder(item) {
    companion object {
        fun newInstance(parent: ViewGroup, clickOn: Clicker) = ChatViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item, parent, false
            ), clickOn
        )
    }

    private val textView by lazy { item.findViewById<TextView>(R.id.text) }
    private val layout by lazy { item.findViewById<ConstraintLayout>(R.id.root) }

    fun bindItem(item: CountryForView) {
        textView.text = item.name
        layout.setOnClickListener {
            clickOn.clicker(item)
        }
    }


}


