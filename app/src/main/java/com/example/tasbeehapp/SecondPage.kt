package com.example.tasbeehapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tasbeehapp.databinding.ActivityFourthPageBinding
import com.example.tasbeehapp.databinding.ActivitySecondpageBinding

class SecondPage : AppCompatActivity() {
    private lateinit var binding: ActivitySecondpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
           val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
//       binding.nextButton.setOnClickListener {
//           val intent = Intent(this, ThirdPage::class.java)
//           startActivity(intent)
//           finish()
//       }

    }
}