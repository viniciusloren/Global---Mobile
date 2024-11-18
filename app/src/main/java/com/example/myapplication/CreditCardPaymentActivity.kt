package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CreditCardPaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit_card_payment)

        val payButton: Button = findViewById(R.id.payButton)
        val backButton: Button = findViewById(R.id.backButton)

        // Lógica para o botão de PAGAR
        payButton.setOnClickListener {
            // Aqui você pode adicionar a lógica de pagamento real
            // Para fins de exemplo, exibe uma mensagem de pagamento aprovado
            Toast.makeText(this, "Pagamento aprovado!", Toast.LENGTH_SHORT).show()
        }

        // Lógica para o botão de VOLTAR
        backButton.setOnClickListener {
            finish() // Volta para a tela anterior
        }
    }
}
