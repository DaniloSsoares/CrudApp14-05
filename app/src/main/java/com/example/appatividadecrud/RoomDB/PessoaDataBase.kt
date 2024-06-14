package com.example.appatividadecrud.RoomDB

import androidx.room.Database
import androidx.room.RoomDatabase

// Anotação que define o banco de dados do Room, especificando as entidades e a versão do banco de dados
@Database(
    entities = [Pessoa::class],
    version = 1
)
//Banco de dados
abstract class PessoaDataBase: RoomDatabase() {
    abstract fun pessoaDao(): PessoaDao
}
