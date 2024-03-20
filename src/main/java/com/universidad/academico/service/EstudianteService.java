package com.universidad.academico.service;

import java.util.List;

import com.universidad.academico.dto.EstudianteDTO;

public interface EstudianteService {
    
    List<EstudianteDTO> findAll();
}
