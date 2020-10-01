package com.bdatos.prubasedatoswild.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bdatos.prubasedatoswild.entities.PaisesEntity;
import com.bdatos.prubasedatoswild.responses.PaisesResponse;
import com.bdatos.prubasedatoswild.services.PaisesService;


//@CrossOrigin(origins = "*", maxAge = 3600)
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
