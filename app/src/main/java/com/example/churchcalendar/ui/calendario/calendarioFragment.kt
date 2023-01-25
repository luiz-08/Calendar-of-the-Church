package com.example.churchcalendar.ui.calendario

import androidx.fragment.app.Fragment
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
    private val events = mutableMapOf<Calendar, String>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val eventDates = listOf(1,8,15,22,29)
        val eventDescriptionsCulto = listOf ("Culto de Domingo1", "Culto de Domingo2", "Culto de Domingo3",
            "Culto de Domingo4", "Culto de Domingo5" )


        binding = FragmentCalendarioBinding.inflate(layoutInflater)
        val currentDate = Calendar.getInstance()
        binding.calendarioIgreja.date = currentDate.timeInMillis

+
        binding.calendarioIgreja.setOnDateChangeListener {view, year, month, dayofMonth ->

            val selectedDate = Calendar.getInstance().apply {
                set(Calendar.YEAR, year)
                set(Calendar.MONTH, month)
                set(Calendar.DAY_OF_MONTH, dayofMonth)
            }

            for (i in eventDates.indices){
                val eventDate = Calendar.getInstance().apply {
                    set(Calendar.YEAR, 2023)
                    set(Calendar.MONTH, Calendar.JANUARY)
                    set(Calendar.DAY_OF_MONTH, eventDates[i])
                }
                events[eventDate] = eventDescriptionsCulto[i]
            }
            val event = events[selectedDate]
            binding.EventodataCulto.text = event
        }
        return binding.root
    }
}


