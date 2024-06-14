package com.example.appatividadecrud.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.appatividadecrud.RoomDB.Pessoa
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
// Declaração da classe PessoaViewModel, que herda de ViewModel
class PessoaViewModel(private val repository: Repository): ViewModel() {
    // Função para obter todas as pessoas do repositório e transformá-las em LiveData
    fun getPessoa() = repository.getAllPessoa().asLiveData(viewModelScope.coroutineContext)

    // Função para inserir ou atualizar uma pessoa no repositório
    fun upsertPessoa(pessoa: Pessoa){
         // Inicia uma coroutine no escopo do ViewModel
        viewModelScope.launch {
            // Chama o método de inserir ou atualizar do repositório
            repository.upsertPessoa(pessoa)
        }
    }
// Função para deletar uma pessoa do repositório
    fun deletePessoa(pessoa: Pessoa) {
         // Inicia uma coroutine no escopo do ViewModel
        viewModelScope.launch {
            repository.deletePessoa(pessoa)
        }
    }
}
