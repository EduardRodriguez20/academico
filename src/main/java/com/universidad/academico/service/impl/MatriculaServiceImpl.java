package com.universidad.academico.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universidad.academico.dto.MatriculaDTO;
import com.universidad.academico.dto.converters.MatriculaDTOconverte;
import com.universidad.academico.repository.EstudianteRepository;
import com.universidad.academico.repository.MatriculaRepository;
import com.universidad.academico.repository.entities.EstudianteEntity;
import com.universidad.academico.repository.entities.MatriculaEntity;
import com.universidad.academico.service.MatriculaService;

import jakarta.transaction.Transactional;

@Service
public class MatriculaServiceImpl implements MatriculaService{

    @Autowired
    private MatriculaRepository matriculaRepository;
    
    @Autowired
    private EstudianteRepository estudianteRepository;
    
    @Autowired
    private MatriculaDTOconverte convert;

    @SuppressWarnings("null")
    @Override
    @Transactional
    public MatriculaDTO save(MatriculaDTO matricula) {
        Optional<EstudianteEntity> estudianteOptional = estudianteRepository.findById(matricula.getEstudianteId());
        if (estudianteOptional.isPresent()) {
            MatriculaEntity matriculaEntity = convert.convertMatriculaEntity(matricula);
            matriculaEntity.setEstudiante(estudianteOptional.get());
            matriculaRepository.save(matriculaEntity);
            return convert.convertMatriculaDTO(matriculaEntity);
        }
        return null;
    }

    @Override
    public List<MatriculaDTO> findAll() {
        List<MatriculaEntity> matriculasEntities = (List<MatriculaEntity>) matriculaRepository.findAll();
        return matriculasEntities.stream()
                                 .map(matricula -> convert.convertMatriculaDTO(matricula))
                                 .toList();
    }
    
}
