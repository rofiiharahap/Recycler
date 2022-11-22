package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.ayam,
                "Ayam Nasi",
                "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.burger,
                "Burger Minuman",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(R.drawable.cocacola,
                "Cocacola Frestea",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(R.drawable.eskrim,
                "Escrim",
                "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(R.drawable.floats,
                "Escrim Float",
                "lorem lipsum lorem lipsum lorem lipsum"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}