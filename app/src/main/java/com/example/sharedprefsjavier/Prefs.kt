package com.example.sharedprefsjavier

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {
    val PREFS_NAME = "com.example.sharedprefsjavier.sharedpreferences" //Aqui es donde se guardan las preferencias
    val SHARED_NAME = "shared_name"
    val SHARED_NAME2 = "shared_name2"//Esta es la clave de la preferencia

    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME,0)

    var name:String?
        get() = prefs.getString(SHARED_NAME,"")
        set(value) = prefs.edit().putString(SHARED_NAME,value).apply()

    var apellido:String?
        get() = prefs.getString(SHARED_NAME2,"")
        set(value) = prefs.edit().putString(SHARED_NAME2,value).apply()
}