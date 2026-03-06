package com.example.holamundo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val textView2 = findViewById<TextView>(R.id.textoSaludo2)
        val botonRegresar = findViewById<Button>(R.id.Button3)
        // Recibir datos del Bundle
        val nombre = intent.getStringExtra("nombre_key")
        if (!nombre.isNullOrBlank()) {
            textView2.setText(textView2.text.toString() + " " + nombre)
        } else {
            textView2.setText("No se recibio ningun nombre") // Para depurar
        }

        // Botón Regresar → vuelve a MainActivity
        botonRegresar.setOnClickListener {
            finish()
        }
    }
}