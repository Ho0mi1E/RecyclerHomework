package com.example.recyclerhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerhomework.domain.models.CountryForView
import com.example.recyclerhomework.presintation.ListFragment
import com.example.recyclerhomework.presintation.ViewModelCountry
import com.example.recyclerhomework.presintation.clickandpost.Clicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        openBottom()
    }

    private fun openBottom() {
        val fragment = ListFragment(ViewModelCountry(),list)
        edit.setOnClickListener {
            fragment.show(supportFragmentManager, ListFragment.TAG)
        }
    }

    private val list = object : Clicker {
        override fun clicker(data: CountryForView) {
            edit.setText(data.data)
        }
    }


}
