package com.enaitzdam.appmvvmzero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.enaitzdam.appmvvmzero.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater)

        binding.buttonCount.setOnClickListener {
            var edat = binding.editTextEdat.text.toString().toInt()
            viewModel.countAges(edat)
            var count = viewModel.contadorAlumnesEdat
            Toast.makeText( context, count.toString() , Toast.LENGTH_SHORT).show()
        }


        return binding.root

    }


}