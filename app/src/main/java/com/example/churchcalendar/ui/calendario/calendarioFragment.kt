package com.example.churchcalendar.ui.calendario

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.churchcalendar.R
import com.example.churchcalendar.databinding.FragmentCalendarioBinding
import java.text.NumberFormat.getInstance
import java.util.*
import java.util.Calendar.getInstance

class calendarioFragment : androidx.fragment.app.Fragment() {

    private lateinit var binding: FragmentCalendarioBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {

        binding = FragmentCalendarioBinding.inflate(layoutInflater)
        val currentDate = Calendar.getInstance()
        binding.calendarioIgreja.date = currentDate.timeInMillis


        val events = mutableMapOf<Calendar, String>()
        binding.calendarioIgreja.setOnDateChangeListener {view, year, month, dayofMonth ->
            val selectedDate = Calendar.getInstance().apply {
                set(Calendar.YEAR, year)
                set(Calendar.MONTH, month)
                set(Calendar.DAY_OF_MONTH, dayofMonth)
            }

            events[Calendar.getInstance().apply {
                set(Calendar.YEAR, 2023)
                set(Calendar.MONTH, Calendar.JANUARY)
                set(Calendar.DAY_OF_MONTH, 10)
            }] = "ANIVERSÁRIO DO BRABO AQUI MEU LINDO!!"

            val event = events[selectedDate]
            binding.Eventodata.text = event
        }
        return binding.root
    }
}


