package com.example.recyclerhomework

import android.annotation.SuppressLint
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerhomework.recycler.ChatAdapter
import com.example.recyclerhomework.recycler.Clicker
import com.example.recyclerhomework.recycler.Country
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_fragment.*

class ListFragment : BottomSheetDialogFragment() {
    companion object{
       const val TAG = "LIST"
        fun newInstance() = ListFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_fragment, container, false)
    }
    private val adapter by lazy { ChatAdapter(clicker) }
    private val edittext by lazy { edit }
    private val clicker by lazy {
        object : Clicker {
            override fun clicker(country: Country) {
                edittext.setText(R.id.text)





            }

        } }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler.adapter = adapter

        adapter.submitList(listOf(
            Country("ff"),
            Country("ff"),
            Country("ff"),
            Country("ff"),
            Country("ff"),
        ))

    }
}

