package com.example.recyclerhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerhomework.domain.models.CountryForView
import com.example.recyclerhomework.presintation.ListFragment
import com.example.recyclerhomework.presintation.ViewModelCountry
import com.example.recyclerhomework.presintation.clickandpost.Clicker
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModelCountry: ViewModelCountry by viewModel<ViewModelCountry>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        openBottom()
    }

    private val list = object : Clicker {
        override fun clicker(country: CountryForView) {
            edit.setText(country.data)
        }
    }

    private fun openBottom() {
        val fragment = ListFragment(viewModelCountry, list)
        edit.setOnClickListener {
            fragment.show(supportFragmentManager, ListFragment.TAG)
        }
    }


}
