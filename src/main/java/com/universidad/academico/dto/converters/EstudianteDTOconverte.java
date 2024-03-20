package com.universidad.academico.dto.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.universidad.academico.dto.EstudianteDTO;
import com.universidad.academico.repository.entities.EstudianteEntity;

@Component
public class EstudianteDTOconverte {
    
    @Autowired
    private ModelMapper dbm;

    public EstudianteDTO converEstudianteDTO(EstudianteEntity estudiante){
        EstudianteDTO estudianteDTO = dbm.map(estudiante, EstudianteDTO.class);
        if (estudiante.getMatricula() != null) {
            estudianteDTO.setMatriculaId(estudiante.getMatricula().getId());
        }
        estudianteDTO.setUniversidadId(estudiante.getUniversidad().getId());
        return estudianteDTO;
    }

    public EstudianteEntity converEstudianteEntity(EstudianteDTO estudianteDTO){
        return dbm.map(estudianteDTO, EstudianteEntity.class);
    }


}
