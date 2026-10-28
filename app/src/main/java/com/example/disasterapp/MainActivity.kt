package com.example.disasterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.disasterapp.databinding.ActivityMainBinding
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val adapterDisaster = DisasterAdapter(generateDummy())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val adapterDisaster = DisasterAdapter(generateDummy())
        with(binding) {
            rvDisaster.apply {
                adapter = adapterDisaster
                layoutManager = LinearLayoutManager(this@MainActivity)

            }
        }
    }


    fun generateDummy(): List<Disaster> {
        return listOf(
            Disaster(nameDisaster = "Tsunami", disasterType = "Natural"),
            Disaster(nameDisaster = "Volcanic Eruption", disasterType =
                "Natural"),
            Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
            Disaster(nameDisaster = "Flood", disasterType = "Natural"),
            Disaster(nameDisaster = "Fire", disasterType = "Natural"),

            Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man- made"),

            Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man- made"),

            Disaster(nameDisaster = "War", disasterType = "Man-made")
        )
    }
}