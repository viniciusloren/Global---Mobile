package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    // Declarando o View Binding e FirebaseAuth
    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializando o View Binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializando o FirebaseAuth
        auth = FirebaseAuth.getInstance()

        // Configurando o botão de login
        binding.btnLogin.setOnClickListener {
            // Recuperando os valores de e-mail e senha das views
            val email = binding.email.text.toString().trim()  // Acessa o TextInputEditText do e-mail
            val password = binding.password.text.toString().trim()  // Acessa o TextInputEditText da senha

            // Realiza o login, sem validação ou verificação
            loginUser(email, password)
        }
    }

    private fun loginUser(email: String, password: String) {
        // Usando o Firebase Authentication para autenticar o usuário
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                // Redireciona para o MenuActivity independentemente do sucesso ou falha no login
                val user = auth.currentUser
                Toast.makeText(this, "Bem-vindo!", Toast.LENGTH_SHORT).show()

                // Redireciona para o MenuActivity
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)

                // Finaliza a LoginActivity para que o usuário não possa voltar para ela
                finish()
            }
    }
}
