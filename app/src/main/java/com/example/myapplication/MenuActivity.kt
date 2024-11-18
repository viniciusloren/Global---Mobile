package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnNotificacoes: Button = findViewById(R.id.btnNotificacoes)
        val btnFaturas: Button = findViewById(R.id.btnFaturas)
        val btnPagamentos: Button = findViewById(R.id.btnPagamentos)
        val btnRelatorios: Button = findViewById(R.id.btnRelatorios)
        val btnSair: Button = findViewById(R.id.btnSair)

        btnNotificacoes.setOnClickListener { navigateToNotifications() }
        btnFaturas.setOnClickListener { navigateToBills() }
        btnPagamentos.setOnClickListener { navigateToPayments() }
        btnRelatorios.setOnClickListener { navigateToReports() }
        btnSair.setOnClickListener { finish() }
    }

    private fun navigateToNotifications() {
        val intent = Intent(this, NotificationsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToBills() {
        val intent = Intent(this, InvoicesActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToPayments() {
    }

    private fun navigateToReports() {
    }
}
