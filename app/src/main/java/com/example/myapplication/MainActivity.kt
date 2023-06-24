package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.tvvvvvvvvv.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
//2
            var intent = Intent(application, MainActivity2::class.java)
            startActivity(intent);
    }
}