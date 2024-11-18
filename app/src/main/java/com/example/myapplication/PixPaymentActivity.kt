package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PixPaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pix_payment)

        val qrCodeImage: ImageView = findViewById(R.id.qrCodeImage)
        val backButton: Button = findViewById(R.id.backButton)

        qrCodeImage.setImageResource(R.drawable.sample_qr_code)

        backButton.setOnClickListener {
            finish()
        }
    }
}
