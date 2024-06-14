package com.example.appatividadecrud.RoomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

// Declara a classe Pessoa como uma entidade do Room, representando uma tabela no banco de dados
@Entity
data class Pessoa(
    // Declara o campo 'nome' do tipo String para armazenar o nome da pessoa
    val nome: String,
    // Declara o campo 'telefone' do tipo String para armazenar o telefone da pessoa
    val telefone :String,

    // Declara o campo 'id' como a chave primária da tabela, com geração automática de valores
    @PrimaryKey(autoGenerate =  true)
    val  id:Int = 0
)
