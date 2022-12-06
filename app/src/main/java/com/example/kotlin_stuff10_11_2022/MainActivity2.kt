package com.example.kotlin_stuff10_11_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var Stoptime: Long = 0
        start_btn.setOnClickListener{
            chronometer1.base=SystemClock.elapsedRealtime()+Stoptime
            chronometer1.start()
            start_btn.visibility= View.GONE
            stop_btn.visibility=View.VISIBLE
        }
        stop_btn.setOnClickListener {
            Stoptime = chronometer1.base-SystemClock.elapsedRealtime()
            chronometer1.stop()
            stop_btn.visibility=View.GONE
            start_btn.visibility =View.VISIBLE
        }
        reset_btn.setOnClickListener {
            chronometer1.base=SystemClock.elapsedRealtime()
            Stoptime=0
            start_btn.visibility=View.GONE
            stop_btn.visibility=View.VISIBLE
        }
    }
}