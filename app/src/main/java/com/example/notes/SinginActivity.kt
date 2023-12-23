package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SinginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)

        val button = findViewById<View>(R.id.singButton)
        button.setOnClickListener {
            val intent = Intent(this@SinginActivity, NotesActivity::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<View>(R.id.signIn)
        button1.setOnClickListener {
            val intent = Intent(this@SinginActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

}