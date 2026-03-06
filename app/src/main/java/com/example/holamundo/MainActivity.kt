package com.example.holamundo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.idNombre)
        val editText2 = findViewById<EditText>(R.id.idApaterno)
        val editText3 = findViewById<EditText>(R.id.idAmaterno)
        val button1 = findViewById<Button>(R.id.ButtonSaludar)
        val button2 = findViewById<Button>(R.id.ButtonCancelar)
        val text1 = findViewById<TextView>(R.id.textoSaludo)

        // Botón Saludar → enviar Bundle a MainActivity2
        button1.setOnClickListener {
            val nombreCompleto = editText1.text.toString() +
                    " " + editText2.text.toString() + " " + editText3.text.toString()


                val intent = Intent(this, MainActivity2::class.java)

                intent.putExtra("nombre_key", nombreCompleto )
                startActivity(intent)

        }

        // Salir de la aplicación
        button2.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }
    }
}