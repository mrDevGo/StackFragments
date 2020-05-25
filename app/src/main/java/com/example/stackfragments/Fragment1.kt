package com.example.stackfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).mBtnNext.setOnClickListener {
            (activity as MainActivity).supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.container, Fragment2()).commit()
        }
        (activity as MainActivity).mBtnBack.setOnClickListener {
            (activity as MainActivity).supportFragmentManager.popBackStack()
        }
    }
}
