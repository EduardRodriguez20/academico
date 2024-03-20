package com.universidad.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.academico.dto.EstudianteDTO;
import com.universidad.academico.service.EstudianteService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/")
    public List<EstudianteDTO> findAll() {
        return estudianteService.findAll();
    }
    
}
