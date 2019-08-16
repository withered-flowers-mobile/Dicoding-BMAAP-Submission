package com.witheredflowers.dicoding.bmaap_submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.witheredflowers.dicoding.bmaap_submission.data.Pokemon
import com.witheredflowers.dicoding.bmaap_submission.data.PokemonData
import com.witheredflowers.dicoding.bmaap_submission.layout.ListPokemonAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var rvPokemon: RecyclerView
    private var list: ArrayList<Pokemon> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPokemon = findViewById(R.id.rv_pokemon)
        rvPokemon.setHasFixedSize(true)

        list.addAll(PokemonData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        val listPokemonAdapter = ListPokemonAdapter(list)

        rvPokemon.layoutManager = LinearLayoutManager(this)
        rvPokemon.adapter = listPokemonAdapter
    }
}
