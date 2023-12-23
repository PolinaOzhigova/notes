package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AdddirActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_directory)

        val button = findViewById<View>(R.id.backButton)
        button.setOnClickListener {
            val intent = Intent(this@AdddirActivity, NotesActivity::class.java)
            startActivity(intent)
        }
    }
}