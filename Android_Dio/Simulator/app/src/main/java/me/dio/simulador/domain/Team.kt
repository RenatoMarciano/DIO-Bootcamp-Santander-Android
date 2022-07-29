package me.dio.simulador.domain

import com.google.gson.annotations.SerializedName

data class Team (
    @SerializedName("nome")
    val nome: String,
    @SerializedName("forca")
    val stars: Int,
    @SerializedName("imagem")
    val image: String,
    var score: Int?
)