package com.witheredflowers.dicoding.bmaap_submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
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

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Main Activity"
        }

        rvPokemon = findViewById(R.id.rv_pokemon)
        rvPokemon.setHasFixedSize(true)

        list.addAll(PokemonData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_about -> {
                val i = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(i)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        val listPokemonAdapter = ListPokemonAdapter(list)

        rvPokemon.layoutManager = LinearLayoutManager(this)
        rvPokemon.adapter = listPokemonAdapter
    }
}
