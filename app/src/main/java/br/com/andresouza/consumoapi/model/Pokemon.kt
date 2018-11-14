package br.com.andresouza.consumoapi.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
        val name: String,
        val sprites: Sprites
)