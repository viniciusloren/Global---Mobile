package com.example.myapplication

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
            val email = binding.email.text.toString().trim()  // Aqui acessamos o TextInputEditText do e-mail
            val password = binding.password.text.toString().trim()  // Aqui acessamos o TextInputEditText da senha

            // Validando os campos de entrada
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Chamando o método para realizar o login com Firebase Authentication
            loginUser(email, password)
        }
    }

    private fun loginUser(email: String, password: String) {
        // Usando o Firebase Authentication para autenticar o usuário
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Login bem-sucedido
                    val user = auth.currentUser
                    Toast.makeText(this, "Bem-vindo, ${user?.email}!", Toast.LENGTH_SHORT).show()

                    // Após o login bem-sucedido, você pode permanecer na tela de login
                    // Não há redirecionamento para outra activity aqui
                } else {
                    // Caso falhe o login
                    Toast.makeText(this, "Falha no login. Verifique suas credenciais.", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
