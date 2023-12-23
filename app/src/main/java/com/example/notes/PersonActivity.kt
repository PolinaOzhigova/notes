package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PersonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_page)

        val button = findViewById<View>(R.id.backButton)
        button.setOnClickListener {
            val intent = Intent(this@PersonActivity, NotesActivity::class.java)
            startActivity(intent)
        }


        val button1 = findViewById<View>(R.id.toPayment)
        button1.setOnClickListener {
            val intent = Intent(this@PersonActivity, PaymentActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<View>(R.id.toPayment2)
        button2.setOnClickListener {
            val intent = Intent(this@PersonActivity, PaymentActivity::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<View>(R.id.toPayment3)
        button3.setOnClickListener {
            val intent = Intent(this@PersonActivity, PaymentActivity::class.java)
            startActivity(intent)
        }
        val button4 = findViewById<View>(R.id.toPayment4)
        button4.setOnClickListener {
            val intent = Intent(this@PersonActivity, PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}