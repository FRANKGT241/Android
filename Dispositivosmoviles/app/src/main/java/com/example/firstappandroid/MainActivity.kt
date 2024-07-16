package com.example.firstappandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonEnviar: Button = findViewById(R.id.buttonEnviar)
        val editnombre: EditText = findViewById(R.id.editnombre)

        buttonEnviar.setOnClickListener {
            val name = editnombre.text.toString()
            val intent = Intent(this, SegundaActivity2::class.java)
            intent.putExtra("Nombre", name)
            startActivity(intent)
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
        }
    }
}
