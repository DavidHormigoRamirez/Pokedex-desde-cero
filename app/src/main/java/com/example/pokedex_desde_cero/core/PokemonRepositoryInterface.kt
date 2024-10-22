package com.example.pokedex_desde_cero.core

import kotlinx.coroutines.flow.StateFlow
import retrofit2.Response

interface PokemonRepositoryInterface {

    suspend fun read(): List<Pokemon>
    suspend fun readOne(id:Int): Pokemon

    val setStream: StateFlow<List<Pokemon>>

}