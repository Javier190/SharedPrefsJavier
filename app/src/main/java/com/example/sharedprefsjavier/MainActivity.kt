package com.example.sharedprefsjavier

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

//Esta aplicacion tal y como esta tiene aplicados conceptos de Shared Preferences al pasar un nombre y apellido guardado en variables globales.
//Ademas tiene implementado un recyclerView
//Me gustaria poder agregarle ROOM para que la lista se llene desde una Base de datos. Ojo que para hacer eso hay que modificar el adapter entre
//muchas otras cosas

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et1: EditText = findViewById<EditText>(R.id.et1)
        var et2: EditText = findViewById<EditText>(R.id.et2)
        var btn_ingresar = findViewById<Button>(R.id.btn_ingresar)

        btn_ingresar.setOnClickListener {
            SharedApp.prefs.name = et1.text.toString()
            SharedApp.prefs.apellido = et2.text.toString()
            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}