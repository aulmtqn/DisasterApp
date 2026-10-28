package com.example.disasterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.disasterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterDisaster = DisasterAdapter(generateDummy())
        with(binding) {
            rvDisaster.apply {
                adapter = adapterDisaster
                layoutManager = GridLayoutManager(this@MainActivity, 2)
            }
        }
    }

    private fun generateDummy(): List<Disaster> {
        return listOf(
            Disaster(nameDisaster = "Tsunami", disasterType = "Natural", image = R.drawable.tsunami),
            Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural", image = R.drawable.volcanic_eruption),
            Disaster(nameDisaster = "Earthquake", disasterType = "Natural", image = R.drawable.earthquake),
            Disaster(nameDisaster = "Flood", disasterType = "Natural", image = R.drawable.flood),
            Disaster(nameDisaster = "Fire", disasterType = "Natural", image = R.drawable.fire),
            Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made", image = R.drawable.nuclear_accident),
            Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made", image = R.drawable.terrorist_attack),
            Disaster(nameDisaster = "War", disasterType = "Man-made", image = R.drawable.war)
        )
    }
}