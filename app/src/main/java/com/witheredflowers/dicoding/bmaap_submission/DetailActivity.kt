package com.witheredflowers.dicoding.bmaap_submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.witheredflowers.dicoding.bmaap_submission.data.Pokemon

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Detail Activity"
        }

        val pokemon = intent.extras?.getParcelable<Pokemon>("pokemon_data")

        val imgPokemon: ImageView = findViewById(R.id.img_detail_pokemon)
        val tvId: TextView = findViewById(R.id.tv_detail_pokemonid)
        val tvName: TextView = findViewById(R.id.tv_detail_pokemonname)
        val tvHP: TextView = findViewById(R.id.tv_detail_pokemonhp)
        val tvAttack: TextView = findViewById(R.id.tv_detail_pokemonattack)
        val tvDefense: TextView = findViewById(R.id.tv_detail_pokemondefense)
        val tvSpAttack: TextView = findViewById(R.id.tv_detail_pokemonspattack)
        val tvSpDefense: TextView = findViewById(R.id.tv_detail_pokemonspdefense)
        val tvSpeed: TextView = findViewById(R.id.tv_detail_pokemonspeed)
        val tvAbi01_name: TextView = findViewById(R.id.tv_detail_pokemonabi01_name)
        val tvAbi01_desc: TextView = findViewById(R.id.tv_detail_pokemonabi01_desc)
        val tvAbi02_name: TextView = findViewById(R.id.tv_detail_pokemonabi02_name)
        val tvAbi02_desc: TextView = findViewById(R.id.tv_detail_pokemonabi02_desc)
        val tvType01:TextView = findViewById(R.id.tv_detail_pokemontype01)
        val tvType02:TextView = findViewById(R.id.tv_detail_pokemontype02)

        Glide
            .with(applicationContext)
            .load(pokemon?.pokePhoto)
            .into(imgPokemon)

        tvId.text = pokemon?.pokeNumber.toString()
        tvName.text = pokemon?.pokeName
        tvHP.text = pokemon?.pokeStats_Hp.toString()
        tvAttack.text = pokemon?.pokeStats_Attack.toString()
        tvDefense.text = pokemon?.pokeStats_Defense.toString()
        tvSpAttack.text = pokemon?.pokeStats_SpAttack.toString()
        tvSpDefense.text = pokemon?.pokeStats_SpDefense.toString()
        tvSpeed.text = pokemon?.pokeStats_Speed.toString()
        tvAbi01_name.text = pokemon?.pokeAbilities01_name
        tvAbi01_desc.text = pokemon?.pokeAbilities01_desc
        tvAbi02_name.text = pokemon?.pokeAbilities02_name
        tvAbi02_desc.text = pokemon?.pokeAbilities02_desc
        tvType01.text = pokemon?.pokeTypes01
        tvType02.text = pokemon?.pokeTypes02
    }
}
