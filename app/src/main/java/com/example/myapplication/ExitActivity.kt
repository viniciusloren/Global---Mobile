package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ExitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exit)

        val btnCancel: Button = findViewById(R.id.btnCancel)
        val btnYes: Button = findViewById(R.id.btnYes)

        btnCancel.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnYes.setOnClickListener {
            finishAffinity()
        }
    }
}
