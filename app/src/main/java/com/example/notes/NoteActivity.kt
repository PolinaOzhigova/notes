package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class NoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note)

        val button = findViewById<View>(R.id.backButton)
        button.setOnClickListener {
            val intent = Intent(this@NoteActivity, NotesActivity::class.java)
            startActivity(intent)
        }

        val buttonPer = findViewById<View>(R.id.buttonPerson)
        buttonPer.setOnClickListener {
            val intent = Intent(this@NoteActivity, PersonActivity::class.java)
            startActivity(intent)
        }

    }
}