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

        val editapellido: EditText = findViewById(R.id.editapellido)
        val edittelefono: EditText = findViewById(R.id.edittelefono)
        val editedad: EditText = findViewById(R.id.editEdad)
        val editcorreo: EditText = findViewById(R.id.editcorreo)

        buttonEnviar.setOnClickListener {
            val name = editnombre.text.toString()
            val lastname = editapellido.text.toString()
            val phone = edittelefono.text.toString()
            val age = editedad.text.toString()
            val mail = editcorreo.text.toString()

            val intent = Intent(this, SegundaActivity2::class.java)
            intent.putExtra("Nombre", name)
            intent.putExtra("Apellido", lastname)
            intent.putExtra("Telefono", phone)
            intent.putExtra("Edad", age)
            intent.putExtra("Correo", mail)
            startActivity(intent)
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
        }
    }
}
