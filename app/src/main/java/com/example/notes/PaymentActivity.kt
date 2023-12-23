package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)

        val priceArray = resources.getStringArray(R.array.price_name)
        val spinner = findViewById<Spinner>(R.id.tarif)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, priceArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter


        val button = findViewById<View>(R.id.backButton)
        button.setOnClickListener {
            val intent = Intent(this@PaymentActivity, NotesActivity::class.java)
            startActivity(intent)
        }

    }
}