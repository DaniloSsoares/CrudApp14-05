package com.example.appatividadecrud.viewModel

import com.example.appatividadecrud.RoomDB.Pessoa
import com.example.appatividadecrud.RoomDB.PessoaDataBase
// Classe Repository que lida com as operações de atualização e deleção conectadas ao banco de dados através do PessoaDAO
class Repository(private val db: PessoaDataBase) {

class Repository(private val db: PessoaDataBase) {
 // Função suspensa para inserir ou atualizar uma pessoa no banco de dados
    suspend fun upsertPessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }
// Função suspensa para deletar uma pessoa do banco de dados
    suspend fun deletePessoa(pessoa: Pessoa){
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoa() = db.pessoaDao().getAllPessoa()

}
