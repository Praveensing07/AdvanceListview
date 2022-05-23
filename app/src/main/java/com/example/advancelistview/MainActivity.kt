package com.example.advancelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cityData= arrayOf(City("India","NewDelhi"),
                        City("America","Washington"),
                        City("Srilanka","Colombo")
        )
        val cities=findViewById<ListView>(R.id.cities)
        val cityAdapter=CityAdapter(cityData)
        cities.adapter=cityAdapter
    }
}