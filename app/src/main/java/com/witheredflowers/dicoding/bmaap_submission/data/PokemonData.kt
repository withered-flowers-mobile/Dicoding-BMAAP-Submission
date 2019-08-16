package com.witheredflowers.dicoding.bmaap_submission.data

//Resources from https://pokeapi.co/

object PokemonData {
    private val data =
        listOf(
            Pokemon(
                1, "Bulbasaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
                "chlorophyll", "Doubles Speed during strong sunlight.",
                "overgrow", "Strengthens grass moves to inflict 1.5× damage at 1/3 max HP or less.",
                45, 49, 49, 65, 65, 45,
                "grass", "poison"
            ),
            Pokemon(
                2, "Ivysaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png",
                "chlorophyll", "Doubles Speed during strong sunlight.",
                "overgrow", "Strengthens grass moves to inflict 1.5× damage at 1/3 max HP or less.",
                60, 62, 63, 80, 80, 60,
                "grass", "poison"
            ),
            Pokemon(
                3, "Venusaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png",
                "chlorophyll", "Doubles Speed during strong sunlight.",
                "overgrow", "Strengthens grass moves to inflict 1.5× damage at 1/3 max HP or less.",
                80, 82, 83, 100, 100, 80,
                "grass", "poison"
            ),
            Pokemon(
                4, "Charmander", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png",
                "solar-power", "Increases Special Attack to 1.5× but costs 1/8 max HP after each turn during strong sunlight.",
                "blaze", "Strengthens fire moves to inflict 1.5× damage at 1/3 max HP or less.",
                39, 52, 43, 60, 50, 65,
                "fire", "-"
            ),
            Pokemon(
                5, "Charmeleon", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png",
                "solar-power", "Increases Special Attack to 1.5× but costs 1/8 max HP after each turn during strong sunlight.",
                "blaze", "Strengthens fire moves to inflict 1.5× damage at 1/3 max HP or less.",
                58, 64, 58, 80, 65, 80,
                "fire", "-"
            ),
            Pokemon(
                6, "Charizard", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png",
                "solar-power", "Increases Special Attack to 1.5× but costs 1/8 max HP after each turn during strong sunlight.",
                "blaze", "Strengthens fire moves to inflict 1.5× damage at 1/3 max HP or less.",
                78, 84, 78, 109, 85, 100,
                "fire", "-"
            ),
            Pokemon(
                7, "Squirtle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
                "rain-dish", "Heals for 1/16 max HP after each turn during rain.",
                "torrent", "Strengthens water moves to inflict 1.5× damage at 1/3 max HP or less.",
                44, 48, 65, 50, 64, 43,
                "water", "-"
            ),
            Pokemon(
                8, "Wartortle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png",
                "rain-dish", "Heals for 1/16 max HP after each turn during rain.",
                "torrent", "Strengthens water moves to inflict 1.5× damage at 1/3 max HP or less.",
                59, 63, 80, 65, 80, 58,
                "water", "-"
            ),
            Pokemon(
                9, "Blastoise", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png",
                "rain-dish", "Heals for 1/16 max HP after each turn during rain.",
                "torrent", "Strengthens water moves to inflict 1.5× damage at 1/3 max HP or less.",
                79, 83, 100, 85, 105, 78,
                "water", "-"
            ),
            Pokemon(
                10, "Caterpie", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png",
                "run-away", "Ensures success fleeing from wild battles.",
                "shield-dust", "Protects against incoming moves' extra effects.",
                45, 30, 35, 20, 20, 45,
                "bug", "-"
            ),
            Pokemon(
                11, "Metapod", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png",
                "shed-skin", "Has a 33% chance of curing any major status ailment after each turn.",
                "-", "-",
                50, 20, 55, 25, 25, 30,
                "bug", "-"
            ),
            Pokemon(
                12, "Butterfree", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png",
                "tinted-lens", "Doubles damage inflicted with not-very-effective moves.",
                "compound-eyes", "Has 1.3× their accuracy. No effect on the one-hit KO moves (fissure, guillotine, horn drill, and sheer cold).",
                60, 45, 50, 90, 80, 70,
                "bug", "flying"
            )
        )


    val listData: ArrayList<Pokemon>
        get() {
            val list = arrayListOf<Pokemon>()
            for (aData in data) {
                list.add(aData)
            }

            return list
        }
}