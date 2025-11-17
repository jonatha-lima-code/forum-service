package com.service_forum.forum.service

import com.service_forum.forum.model.Curso
import com.service_forum.forum.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*
@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repository.getOne(id)
    }


}
