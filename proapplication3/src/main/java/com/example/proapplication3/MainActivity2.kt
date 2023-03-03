package com.example.ch8_event

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.proapplication3.databinding.ActivityPhoneBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.onTouchEvent(event: MotionEvent?): Bolean {
            binding.button1.visibility = View.INVISIBLE
            return@onTouchEvent
        }
        binding.button2.setOnClickListener {
            binding.button2.visibility = View.VISIBLE
        }
    }
}