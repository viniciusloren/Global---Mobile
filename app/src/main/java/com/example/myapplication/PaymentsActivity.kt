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

        // Ação para o botão PIX
        btnPix.setOnClickListener {
            val intent = Intent(this, PixPaymentActivity::class.java)
            startActivity(intent)
        }

        // Ação para o botão Cartão de Crédito
        btnCreditCard.setOnClickListener {
            val amount = amountInput.text.toString()

            // Redireciona diretamente para a tela de pagamento com cartão
            val intent = Intent(this, CreditCardPaymentActivity::class.java).apply {
                // Passando o valor para a tela de pagamento com cartão
                putExtra("amount", amount)
            }
            startActivity(intent)
        }

        // Ação para o botão Voltar
        btnBack.setOnClickListener {
            finish() // Finaliza a atividade e retorna à tela anterior
        }
    }
}
