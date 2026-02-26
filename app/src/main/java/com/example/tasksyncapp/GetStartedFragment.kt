package com.example.tasksyncapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GetStartedFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GetStartedFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        auth = FirebaseAuth.getInstance()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_get_started, container, false)

        // If user is already signed in, navigate to main/home fragment (replace with your destination)
        val currentUser = auth.currentUser
        if (currentUser != null) {
            // TODO: Replace with your main/home fragment destination
            // findNavController().navigate(R.id.action_getStartedFragment_to_homeFragment)
        }

        val btnGetStarted = view.findViewById<Button>(R.id.btnGetStarted)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)

        btnGetStarted.setOnClickListener {
            findNavController().navigate(R.id.action_getStartedFragment_to_registerFragment)
        }

        btnLogin.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GetStartedFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GetStartedFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}