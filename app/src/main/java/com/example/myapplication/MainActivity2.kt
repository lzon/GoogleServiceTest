package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var content: ByteArray? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Utils.cacheContext = this
        setContentView(R.layout.activity_main2)

        content = ByteArray(1000 * 1000 * 40)

    }
}