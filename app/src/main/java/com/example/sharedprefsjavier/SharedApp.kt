package com.example.sharedprefsjavier

import android.app.Application

class SharedApp: Application() {
    companion object {
        lateinit var prefs: Prefs
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
//en el manifest se agrega android:name=".SharedApp"> ahi se instancia la Clase Manager de las preferencias
}