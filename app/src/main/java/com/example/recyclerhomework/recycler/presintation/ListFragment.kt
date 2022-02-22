package com.example.recyclerhomework.recycler.presintation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerhomework.R
import com.example.recyclerhomework.recycler.data.ListOfCountry
import com.example.recyclerhomework.recycler.domain.models.CountryForView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.list_fragment.*

class ListFragment(message: Postman) : BottomSheetDialogFragment() {

    companion object {
        const val TAG = "TAG"
    }

    private val adapter by lazy { ChatAdapter(clicker) }


    private val clicker by lazy {
        object : Clicker {
            override fun clicker(country: CountryForView) {
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
           ListOfCountry.mapper()
        )

    }
}

