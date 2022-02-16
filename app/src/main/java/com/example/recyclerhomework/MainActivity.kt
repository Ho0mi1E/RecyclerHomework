package com.example.recyclerhomework

import android.os.Bundle
import android.text.Editable

import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerhomework.recycler.Connect

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openBottom()
    }



    private fun openBottom(){
        edit.setOnClickListener {
            ListFragment.newInstance().show(supportFragmentManager,ListFragment.TAG)
        }

    }


}

