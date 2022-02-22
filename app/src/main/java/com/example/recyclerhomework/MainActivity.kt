package com.example.recyclerhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerhomework.recycler.domain.models.CountryForView
import com.example.recyclerhomework.recycler.presintation.ListFragment
import com.example.recyclerhomework.recycler.presintation.Postman
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openBottom()
    }

    private fun openBottom() {
        val fragment = ListFragment(list)
        edit.setOnClickListener {
            fragment.show(supportFragmentManager, ListFragment.TAG)
        }
    }

    private val list = object : Postman {
        override fun mail(data: CountryForView) {
            edit.setText(data.name)
        }
    }


}
