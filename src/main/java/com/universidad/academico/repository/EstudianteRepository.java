package com.universidad.academico.repository;

import org.springframework.data.repository.CrudRepository;

import com.universidad.academico.repository.entities.EstudianteEntity;

public interface EstudianteRepository extends CrudRepository<EstudianteEntity, Long>{
    
}
