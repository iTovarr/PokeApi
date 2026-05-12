package com.example.pokeapi

data class PokemonResponse(
    val results: List<PokemonEntry>
)

data class PokemonEntry(
    val name: String,
    val url: String
) {
    // Extrae el ID de la URL para obtener la imagen de GitHub
    val id: Int
        get() = url.split("/").dropLast(1).last().toInt()

    val imageUrl: String
        get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$id.png"
}