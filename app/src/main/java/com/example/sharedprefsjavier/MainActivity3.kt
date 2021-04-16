package com.example.sharedprefsjavier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {

    lateinit var mRecyclerView: RecyclerView
    val mAdapter: RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        setUpRecyclerView()
    }

    fun setUpRecyclerView() {
        mRecyclerView = findViewById(R.id.recycler_peliculas) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getSuperheros(), this)  //recuerda que el adapter del recycler pide 2 parametros, contexto y la lista
        mRecyclerView.adapter = mAdapter  //Este es como el metodo mRecyclerView.setadapter(madapter) de JAVA
    }

    fun getSuperheros(): MutableList<Movie> {
        var superheros: MutableList<Movie> = ArrayList()
        superheros.add(Movie("Spiderman II", "Accion", "2007", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        superheros.add(Movie("Daredevil: Awake", "Accion", "2014", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        superheros.add(Movie("Wolverine: The Last X", "Drama", "2008", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        superheros.add(Movie("Batman & Justice League Dark", "Animada", "2019", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        superheros.add(Movie("Thor: Thunder & Glory", "Accion", "2020", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        superheros.add(Movie("The Flash: Part I", "Accion", "2024", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        superheros.add(Movie("Green Lantantern Corp", "Drama", "2018", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        superheros.add(Movie("Wonder Woman: 1984", "Suspenso", "2021", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
        return superheros
    }
}