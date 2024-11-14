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

        // Configurando os botões de navegação
        val btnNotificacoes: Button = findViewById(R.id.btnNotificacoes)
        val btnFaturas: Button = findViewById(R.id.btnFaturas)
        val btnPagamentos: Button = findViewById(R.id.btnPagamentos)
        val btnRelatorios: Button = findViewById(R.id.btnRelatorios)
        val btnSair: Button = findViewById(R.id.btnSair)

        // Ações de clique
        btnNotificacoes.setOnClickListener { navigateToNotifications() }
        btnFaturas.setOnClickListener { navigateToBills() }
        btnPagamentos.setOnClickListener { navigateToPayments() }
        btnRelatorios.setOnClickListener { navigateToReports() }
        btnSair.setOnClickListener { finish() }  // Sair do app
    }

    // Funções de navegação para telas que você pode criar mais tarde
    private fun navigateToNotifications() {
        // Intente para a tela de Notificações
    }

    private fun navigateToBills() {
        // Intente para a tela de Faturas
    }

    private fun navigateToPayments() {
        // Intente para a tela de Pagamentos
    }

    private fun navigateToReports() {
        // Intente para a tela de Relatórios
    }
}
