package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class NotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notes_main)

        val button = findViewById<View>(R.id.buttonPerson)
        button.setOnClickListener {
            val intent = Intent(this@NotesActivity, PersonActivity::class.java)
            startActivity(intent)
        }

        val buttonNote = findViewById<View>(R.id.imageButton9)
        buttonNote.setOnClickListener {
            val intent = Intent(this@NotesActivity, NoteActivity::class.java)
            startActivity(intent)
        }
        val button10 = findViewById<View>(R.id.imageButton10)
        button10.setOnClickListener {
            val intent = Intent(this@NotesActivity, NoteActivity::class.java)
            startActivity(intent)
        }
        val button11 = findViewById<View>(R.id.imageButton11)
        button11.setOnClickListener {
            val intent = Intent(this@NotesActivity, NoteActivity::class.java)
            startActivity(intent)
        }
        val button12 = findViewById<View>(R.id.textView26)
        button12.setOnClickListener {
            val intent = Intent(this@NotesActivity, NoteActivity::class.java)
            startActivity(intent)
        }
        val button13 = findViewById<View>(R.id.textView27)
        button13.setOnClickListener {
            val intent = Intent(this@NotesActivity, NoteActivity::class.java)
            startActivity(intent)
        }
        val button14 = findViewById<View>(R.id.textView28)
        button14.setOnClickListener {
            val intent = Intent(this@NotesActivity, NoteActivity::class.java)
            startActivity(intent)
        }

        val buttonPay = findViewById<View>(R.id.toPayment)
        buttonPay.setOnClickListener {
            val intent = Intent(this@NotesActivity, PaymentActivity::class.java)
            startActivity(intent)
        }

        val buttonAdd = findViewById<View>(R.id.imageButton)
        buttonAdd.setOnClickListener {
            val intent = Intent(this@NotesActivity, AdddirActivity::class.java)
            startActivity(intent)
        }
    }
}