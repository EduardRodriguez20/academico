package com.universidad.academico.repository.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "universidad")
@Data
public class UniversidadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "universidad", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EstudianteEntity> estudiantes;
}
