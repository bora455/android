package com.example.proapplication3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /*private var mBinding: ActivityViewBinding? = null
    private val binding get() = mBinding!!*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)
        /*mBinding = ActivityViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvMessage.setText("안녕하세요 김보미입니다.")*/
    }

 /*   override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }*/
}