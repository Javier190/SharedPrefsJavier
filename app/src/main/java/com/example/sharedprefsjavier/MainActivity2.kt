package com.example.sharedprefsjavier

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var tv1: TextView = findViewById<TextView>(R.id.tv1)
        var tv2: TextView = findViewById<TextView>(R.id.tv2)

        tv1.text = SharedApp.prefs.name
        tv2.text = SharedApp.prefs.apellido

        btn_ir_recycler.setOnClickListener {
            var intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}