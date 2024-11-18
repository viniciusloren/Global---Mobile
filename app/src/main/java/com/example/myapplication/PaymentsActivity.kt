package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PaymentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payments)

        val btnPix: Button = findViewById(R.id.pixButton)
        val btnCreditCard: Button = findViewById(R.id.creditCardButton)
        val btnBack: Button = findViewById(R.id.backButton)
        val amountInput: EditText = findViewById(R.id.paymentValue)

        btnPix.setOnClickListener {
            val intent = Intent(this, PixPaymentActivity::class.java)
            startActivity(intent)
        }


        btnCreditCard.setOnClickListener {
            processPayment(amountInput.text.toString(), "Cartão de Crédito")
        }

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun processPayment(amount: String, paymentMethod: String) {
        if (amount.isNotEmpty()) {
            Toast.makeText(this, "Pagamento de R$ $amount via $paymentMethod realizado com sucesso!", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Por favor, insira um valor para o pagamento.", Toast.LENGTH_SHORT).show()
        }
    }
}
