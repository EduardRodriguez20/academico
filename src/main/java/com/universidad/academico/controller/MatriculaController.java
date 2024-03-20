package com.universidad.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.academico.dto.MatriculaDTO;
import com.universidad.academico.service.MatriculaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    
    @Autowired
    private MatriculaService matriculaService;

    @GetMapping("/")
    public List<MatriculaDTO> getAll(){
        return matriculaService.findAll();
    }

    @PostMapping("/")
    public MatriculaDTO save(@RequestBody MatriculaDTO matricula) {        
        return matriculaService.save(matricula);
    }
    
}
