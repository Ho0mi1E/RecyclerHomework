package com.example.recyclerhomework.presintation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerhomework.R

import com.example.recyclerhomework.domain.models.CountryForView
import com.example.recyclerhomework.presintation.clickandpost.Clicker
import com.example.recyclerhomework.presintation.recycler.ChatAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.list_fragment.*

class ListFragment(private val viewModel: ViewModelCountry, message: Clicker) :
    BottomSheetDialogFragment() {

    companion object {
        const val TAG = "TAG"
    }

    private val adapter by lazy { ChatAdapter(clicker) }
    private val clicker by lazy {
        object : Clicker {
            override fun clicker(country: CountryForView) {
                dismiss()
                message.clicker(country)
                viewModel.loadCountries()

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

    override fun onStart() {
        super.onStart()
        updateView()
        viewModel.countryLiveData.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }
        recycler.adapter = adapter
    }


    private fun updateView(){
        var flag = true
        btn.setOnClickListener {
            if (flag){
                viewModel.update()
                flag = false
            }else{
                viewModel.loadCountries()
                flag = true

            }


        }
    }



}

