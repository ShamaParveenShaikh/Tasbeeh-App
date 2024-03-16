package com.example.tasbeehapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasbeehapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.touch.setOnClickListener {
            count++
            binding.numberTv.text = "" +count
        }
        binding.button1.setOnClickListener {
            count++
            binding.numberTv.text = "" +count
        }
        binding.button2.setOnClickListener {
            count=0
            binding.numberTv.text = "" +count
        }

        binding.button3.setOnClickListener {
            val intent= Intent(this, SecondPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}