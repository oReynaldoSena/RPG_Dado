package com.example.rpgdado

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rpgdado.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        rodarDados()
        setContentView(binding.root)
    }

    fun rodarDados() {
        binding.rolarDado.setOnClickListener {
            val valor = Random.nextInt(20 - 0)
            binding.valorObtido.text = "Você obteve ${valor}"
        }

    }

}