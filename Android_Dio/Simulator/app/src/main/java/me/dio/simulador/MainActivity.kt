package me.dio.simulador

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.simulador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    //setContentView(R.layout.activity_main)
    //val tvHello = findViewById<TextView>(R.id.tvHello)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}