package com.example.firstappandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SegundaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda2)

        val data: TextView = findViewById(R.id.txtNombre)
        val name = intent.getStringExtra("Nombre")
        val lastname = intent.getStringExtra("Apellido")
        val phone = intent.getStringExtra("Telefono")
        val age = intent.getStringExtra("Edad")
        val mail = intent.getStringExtra("Correo")

        val allData = """
        Nombre: $name
        Apellido: $lastname
        Teléfono: $phone
        Edad: $age
        Correo: $mail
    """.trimIndent()

        data.text = allData

    }
}
