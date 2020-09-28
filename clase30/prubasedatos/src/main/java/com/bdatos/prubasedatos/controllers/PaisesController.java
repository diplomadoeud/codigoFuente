package com.bdatos.prubasedatos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdatos.prubasedatos.entities.PaisesEntity;
import com.bdatos.prubasedatos.responses.PaisesResponse;
import com.bdatos.prubasedatos.services.PaisesService;


@RestController
public class PaisesController {
	
    @Autowired
    PaisesService paisesService;
    
    @GetMapping("/paises")
    public List<PaisesEntity> getAllPaises() {
        return paisesService.getAllPaises();
    }
    
    @GetMapping("/paises/{id}")
    public Optional<PaisesEntity> getPais(@PathVariable(value = "id") Integer IdPais) {
    	return paisesService.getUnPais(IdPais);	
     
    }
    
   
    @PostMapping("/paisesnoerrores")
    public PaisesEntity addPais( @RequestBody PaisesEntity paises) {
    	return paisesService.addModPais(paises);
    }
    
    
    
    @PostMapping("/paises")
    public PaisesResponse addPaisRequest( @RequestBody PaisesEntity paises) {
    	return paisesService.addModPaisErrores(paises);
    }
    

    @PutMapping("/paises")
    public PaisesResponse modPais( @RequestBody PaisesEntity paises) {
    	return paisesService.addModPaisErrores(paises);
    }
    
    @DeleteMapping("/paises/{id}")
    public PaisesResponse elPais(@PathVariable(value = "id") Integer IdPai ) {
    	return paisesService.elimPais(IdPai);
    }
    
    
}
