package com.example.appatividadecrud.RoomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

//Declaração das variaveis e seu formato de string para recebimento de infomações sendo definida como classe Pessoa
@Entity
data class Pessoa(
    val nome: String,
    val telefone :String,

    @PrimaryKey(autoGenerate =  true)
    val  id:Int = 0
)
