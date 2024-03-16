package com.example.tasbeehapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasbeehapp.databinding.ActivityThirdPageBinding

class ThirdPage : AppCompatActivity() {
    private lateinit var binding: ActivityThirdPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityThirdPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, FourthPage::class.java)
            startActivity(intent)
            finish()
        }
        binding.backBtn.setOnClickListener {
            val intent = Intent(this,SecondPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}