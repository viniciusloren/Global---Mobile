package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotificationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        val notificationsTitle: TextView = findViewById(R.id.notificationsTitle)
        val notification1: TextView = findViewById(R.id.notification1)
        val notification2: TextView = findViewById(R.id.notification2)
        val notification3: TextView = findViewById(R.id.notification3)
        val notification4: TextView = findViewById(R.id.notification4)
        val notification5: TextView = findViewById(R.id.notification5)
        val notification6: TextView = findViewById(R.id.notification6)
        val btnBack: Button = findViewById(R.id.btnBack)

        notification1.text = "Fatura em aberto"
        notification2.text = "Fatura em atraso"
        notification3.text = "Novo relatório de consumo de energia disponível"
        notification4.text = "Mensagem de manutenção na área no dia 30/11/2024"
        notification5.text = "Erro na atualização do pagamento"
        notification6.text = "Erro em atualizar os dados (entre em contato conosco)"

        btnBack.setOnClickListener {
            finish()
        }
    }
}
