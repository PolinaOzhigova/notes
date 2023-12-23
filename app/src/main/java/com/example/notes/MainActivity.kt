package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.singUp)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, NotesActivity::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<View>(R.id.signIn)
        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, SinginActivity::class.java)
            startActivity(intent)
        }
    }

}