package com.example.mynewjson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button1: Button
    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.buttonActivity)
        button1=findViewById(R.id.buttonActivity1)
        toolbar=findViewById(R.id.toolbar)

        toolbar.setTitle("Practice")

        button.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        button1.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}
