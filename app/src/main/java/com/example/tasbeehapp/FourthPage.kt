package com.example.tasbeehapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasbeehapp.databinding.ActivityFourthPageBinding

class FourthPage : AppCompatActivity() {
    private  lateinit var binding: ActivityFourthPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFourthPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            val intent = Intent(this , ThirdPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}