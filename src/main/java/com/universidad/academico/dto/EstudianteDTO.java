package com.universidad.academico.dto;

import lombok.Data;

@Data
public class EstudianteDTO {
    
    private Long id;
    private String nombre;
    private Long universidadId;
    private Long matriculaId;
}
