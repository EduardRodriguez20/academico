package com.universidad.academico.dto.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.universidad.academico.dto.MatriculaDTO;
import com.universidad.academico.repository.entities.MatriculaEntity;

@Component
public class MatriculaDTOconverte {
    
    @Autowired
    private ModelMapper dbm;

    public MatriculaDTO convertMatriculaDTO(MatriculaEntity matricula){
        MatriculaDTO matriculaDTO = dbm.map(matricula, MatriculaDTO.class);
        matriculaDTO.setEstudianteId(matricula.getEstudiante().getId());
        return matriculaDTO;
    }

    public MatriculaEntity convertMatriculaEntity(MatriculaDTO matriculaDTO){
        return dbm.map(matriculaDTO, MatriculaEntity.class);
    }
    
}
