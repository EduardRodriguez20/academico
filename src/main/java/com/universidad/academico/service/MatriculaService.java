package com.universidad.academico.service;

import java.util.List;

import com.universidad.academico.dto.MatriculaDTO;

public interface MatriculaService {
    
    MatriculaDTO save(MatriculaDTO matricula);

    List<MatriculaDTO> findAll();
}
