package com.example.recyclerhomework
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openBottom()
    }

    private fun openBottom() {
        edit.setOnClickListener {
            ListFragment.newInstance().show(supportFragmentManager, ListFragment.TAG)
        }
    }
}
