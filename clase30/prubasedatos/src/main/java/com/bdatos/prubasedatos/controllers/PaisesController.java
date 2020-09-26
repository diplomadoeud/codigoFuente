package com.bdatos.prubasedatos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdatos.prubasedatos.entities.PaisesEntity;
import com.bdatos.prubasedatos.services.PaisesService;

@RestController
public class PaisesController {
	
    @Autowired
    PaisesService paisesService;
    
    @GetMapping("/paises")
    public List<PaisesEntity> getAllPaises() {
        return paisesService.getAllPaises();
    }
    
    
    
}
