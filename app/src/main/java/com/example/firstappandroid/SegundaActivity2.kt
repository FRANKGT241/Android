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

        val txtNombre: TextView=findViewById(R.id.txtNombre)
        val nombre=intent.getStringExtra("nombre")//leer el nombre mediante una variable
        txtNombre.text=nombre
    }
}