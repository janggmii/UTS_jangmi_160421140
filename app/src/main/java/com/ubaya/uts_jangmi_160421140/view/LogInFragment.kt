package com.ubaya.uts_jangmi_160421140.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubaya.utsanmp_160421140.R
import com.ubaya.utsanmp_160421140.databinding.FragmentLogInBinding


class LogInFragment : Fragment() {
    private lateinit var binding:FragmentLogInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignIn.setOnClickListener{

            val action = LogInFragmentDirections.actionSign()
            Navigation.findNavController(it).navigate(action)
        }
    }
}