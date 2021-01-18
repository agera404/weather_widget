package com.example.weatherwidget

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherwidget.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}