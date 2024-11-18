package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InvoicesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invoices)

        val invoicesTitle: TextView = findViewById(R.id.invoicesTitle)

        val invoiceTitle1: TextView = findViewById(R.id.invoiceTitle1)
        val invoicePrice1: TextView = findViewById(R.id.invoicePrice1)
        val invoiceDate1: TextView = findViewById(R.id.invoiceDate1)

        val invoiceTitle2: TextView = findViewById(R.id.invoiceTitle2)
        val invoicePrice2: TextView = findViewById(R.id.invoicePrice2)
        val invoiceDate2: TextView = findViewById(R.id.invoiceDate2)

        val invoiceTitle3: TextView = findViewById(R.id.invoiceTitle3)
        val invoicePrice3: TextView = findViewById(R.id.invoicePrice3)
        val invoiceDate3: TextView = findViewById(R.id.invoiceDate3)

        val invoiceTitle4: TextView = findViewById(R.id.invoiceTitle4)
        val invoicePrice4: TextView = findViewById(R.id.invoicePrice4)
        val invoiceDate4: TextView = findViewById(R.id.invoiceDate4)

        invoiceTitle1.text = "Fatura em Atraso"
        invoicePrice1.text = "Preço: R$ 350,00"
        invoiceDate1.text = "Data: 15/10/2024"

        invoiceTitle2.text = "Fatura em Atraso"
        invoicePrice2.text = "Preço: R$ 120,00"
        invoiceDate2.text = "Data: 20/09/2024"

        invoiceTitle3.text = "Fatura em Atraso"
        invoicePrice3.text = "Preço: R$ 980,00"
        invoiceDate3.text = "Data: 05/10/2024"

        invoiceTitle4.text = "Fatura em Aberto"
        invoicePrice4.text = "Preço: R$ 450,00"
        invoiceDate4.text = "Data: 25/11/2024"

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}
