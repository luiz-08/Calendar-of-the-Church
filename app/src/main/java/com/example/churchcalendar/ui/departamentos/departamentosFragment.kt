package com.example.churchcalendar.ui.departamentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.churchcalendar.databinding.FragmentDepartamentosBinding


class departamentosFragment : Fragment() {

    private lateinit var binding: FragmentDepartamentosBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentDepartamentosBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textDepartamentos.text = "Aqui será os departamentos! Em produção"
    }
}