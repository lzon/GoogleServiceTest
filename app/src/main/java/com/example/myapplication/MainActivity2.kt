package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    var content: ByteArray? = null
    lateinit var textView: TextView
    lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Utils.cacheContext = this
        setContentView(R.layout.activity_main2)

        content = ByteArray(1000 * 1000 * 40)
        textView   = findViewById(R.id.textView)
        textView2   = findViewById(R.id.textView2)
    }

    fun onClick(view: View) {
        textView.visibility=View.GONE
    }
}