package com.example.stackfragments

import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*


class Fragment3 : Fragment(R.layout.fragment_3) {


    override fun onStart() {
        super.onStart()
        (activity as MainActivity).btn_next.setOnClickListener {
            (activity as MainActivity).supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.container, Fragment1()).commit()
        }
        (activity as MainActivity).btn_back.setOnClickListener {
            (activity as MainActivity).supportFragmentManager.popBackStack()
        }
    }
    override fun onStop() {
        super.onStop()
        retainInstance = true
    }


}
