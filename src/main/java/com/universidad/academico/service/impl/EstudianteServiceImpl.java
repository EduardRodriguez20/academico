package com.universidad.academico.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universidad.academico.dto.EstudianteDTO;
import com.universidad.academico.dto.converters.EstudianteDTOconverte;
import com.universidad.academico.repository.EstudianteRepository;
import com.universidad.academico.repository.entities.EstudianteEntity;
import com.universidad.academico.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private EstudianteDTOconverte convert;

    @Override
    public List<EstudianteDTO> findAll() {
        List<EstudianteEntity> estudiantesEntities = (List<EstudianteEntity>) estudianteRepository.findAll();
        return estudiantesEntities.stream()
                                  .map(estudiante -> convert.converEstudianteDTO(estudiante))
                                  .toList();
    }
    
}
