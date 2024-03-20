package com.universidad.academico.repository;

import org.springframework.data.repository.CrudRepository;

import com.universidad.academico.repository.entities.MatriculaEntity;

public interface MatriculaRepository extends CrudRepository<MatriculaEntity, Long>{
    
}
