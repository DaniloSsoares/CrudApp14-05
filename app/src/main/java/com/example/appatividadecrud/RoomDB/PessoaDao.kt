package com.example.appatividadecrud.RoomDB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface PessoaDao {
// realização de insert e update ligado diretamente no banco de dados
    @Upsert
    suspend fun upsertPessoa(pessoa: Pessoa)
// realização de delete no banco de dados e mandamos para o formulário
    @Delete
    suspend fun deletePessoa(pessoa: Pessoa)
// realização de select na requisição do app
    @Query("SELECT * FROM pessoa")
    fun getAllPessoa(): Flow<List<Pessoa>>
}