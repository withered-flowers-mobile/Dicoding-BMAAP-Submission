package com.witheredflowers.dicoding.bmaap_submission.layout

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.witheredflowers.dicoding.bmaap_submission.DetailActivity
import com.witheredflowers.dicoding.bmaap_submission.R
import com.witheredflowers.dicoding.bmaap_submission.data.Pokemon

class ListPokemonAdapter(private val listPokemon: ArrayList<Pokemon>) :
    RecyclerView.Adapter<ListPokemonAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_pokemon, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPokemon.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pokemon: Pokemon = listPokemon.get(position)

        Glide.with(holder.itemView.context)
            .load(pokemon.pokePhoto)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = pokemon.pokeName
        holder.tvStatsHP.text = "HP  = " + pokemon.pokeStats_Hp
        holder.tvStatsSPD.text = "SPD = " + pokemon.pokeStats_Speed

        holder.itemView.setOnClickListener(View.OnClickListener {
            val i = Intent(holder.itemView.context, DetailActivity::class.java)

            i.putExtra("pokemon_data", pokemon)

            holder.itemView.context.startActivity(i)
        })
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name_pokemon)
        var tvStatsHP: TextView = itemView.findViewById(R.id.tv_item_statshp_pokemon)
        var tvStatsSPD: TextView = itemView.findViewById(R.id.tv_item_statsspd_pokemon)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_thumbnail_pokemon)
    }
}