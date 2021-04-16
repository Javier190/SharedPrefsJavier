package com.example.sharedprefsjavier

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var movies: MutableList<Movie>  = ArrayList()
    lateinit var context: Context

    //Constructor
    fun RecyclerAdapter(movies : MutableList<Movie>, context: Context){
        this.movies = movies
        this.context = context
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = movies.get(position)
        holder.bind(item, context)
    }

    //Metodo que devuelve un objeto ViewHolder al cual le pasamos la celda que hemos creado.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.design_lista_peliculas, parent, false))
    }


    override fun getItemCount(): Int {
        return movies.size
    }
    //Viewholder es como la clase encargada de las vistas de los items. y esta clase va a entregar info al adapter

    //Lo que hace esta clase es hacer referencia a los items de la celda, el view.findViewByID()
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titulo = view.findViewById(R.id.tv_titulopelicula) as TextView
        val genero = view.findViewById(R.id.tv_genre) as TextView
        val anio = view.findViewById(R.id.tv_year) as TextView
        val imagen = view.findViewById(R.id.imagen_pelicula) as ImageView

        //aqui se une la data class, que es la estructura de cada Item, con los textviews e imagen(el front)
        fun bind(movie: Movie, context: Context){
            titulo.text = movie.title
            genero.text = movie.genre
            anio.text = movie.year
            imagen.loadUrl(movie.photo)
            itemView.setOnClickListener(View.OnClickListener { Toast.makeText(context, movie.title, Toast.LENGTH_SHORT).show() })
        }
        fun ImageView.loadUrl(url: String) {
            Picasso.with(context).load(url).into(this)
        }
    }
}