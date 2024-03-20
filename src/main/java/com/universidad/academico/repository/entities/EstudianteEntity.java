package com.universidad.academico.repository.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "estudiantes")
@Data
public class EstudianteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private MatriculaEntity matricula;

    @JoinColumn(name = "universidad_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UniversidadEntity universidad;

}
