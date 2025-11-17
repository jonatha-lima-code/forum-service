package com.service_forum.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class NovoTopicoForm(
    @field:NotEmpty(message = " O campo titulo não pode ser vazio")
    @field:Size(min = 5, max = 100)
    val titulo: String,
    @field:NotEmpty(message = " Mensagem não podeser em branco")
    val mensagem: String,
    @field:NotNull
    val idCurso: Long,
    @field:NotNull
    val idAutor: Long
)