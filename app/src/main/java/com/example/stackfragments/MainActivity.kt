package com.example.stackfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mBtnNext: Button
    lateinit var mBtnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnBack = btn_back
        mBtnNext = btn_next
        supportFragmentManager.beginTransaction()
                .add(R.id.container, Fragment1()).commit()
    }
}
