package com.example.tasksyncapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// Remove the param1/param2 parameters if you don't need them
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log_in, container, false)
    }

    companion object {
        /**
         * Simplified factory method without parameters
         */
        @JvmStatic
        fun newInstance() = LoginFragment()
    }
}