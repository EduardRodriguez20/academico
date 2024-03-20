package com.universidad.academico.repository.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "matriculas")
@Data
public class MatriculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double feed;

    @JoinColumn(name = "estudiante_id")
    @OneToOne(fetch = FetchType.LAZY)
    private EstudianteEntity estudiante;

}
