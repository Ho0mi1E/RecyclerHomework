package com.example.recyclerhomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerhomework.data.ListofCountry
import com.example.recyclerhomework.recycler.ChatAdapter
import com.example.recyclerhomework.recycler.Clicker
import com.example.recyclerhomework.recycler.Country
import com.example.recyclerhomework.recycler.Postman
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.list_fragment.*

class ListFragment(message: Postman) : BottomSheetDialogFragment() {

    companion object {
        const val TAG = "TAG"
    }

    private val adapter by lazy { ChatAdapter(clicker) }

    private val clicker by lazy {
        object : Clicker {
            override fun clicker(country: Country) {
                dismiss()
                message.mail(country)

            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler.adapter = adapter

        adapter.submitList(
            ListofCountry.list
        )

    }
}

