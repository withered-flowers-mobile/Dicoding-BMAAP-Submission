package com.witheredflowers.dicoding.bmaap_submission.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pokemon (
    var pokeNumber: Int,
    var pokeName: String,
    var pokePhoto: String,
    var pokeAbilities01_name: String,
    var pokeAbilities01_desc: String,
    var pokeAbilities02_name: String,
    var pokeAbilities02_desc: String,
    var pokeStats_Hp: Int,
    var pokeStats_Attack: Int,
    var pokeStats_Defense: Int,
    var pokeStats_SpAttack: Int,
    var pokeStats_SpDefense: Int,
    var pokeStats_Speed: Int,
    var pokeTypes01: String,
    var pokeTypes02: String
) : Parcelable
