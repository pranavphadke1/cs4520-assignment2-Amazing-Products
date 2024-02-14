package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment:Fragment(R.layout.login_view) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.login_view, container, false)
        val loginButton = view.findViewById<View>(R.id.login_button)
        val navController = findNavController()
        loginButton.setOnClickListener {
            navController.navigate(R.id.action_loginFragment_to_productListFragment)
        }
        return view
    }
}