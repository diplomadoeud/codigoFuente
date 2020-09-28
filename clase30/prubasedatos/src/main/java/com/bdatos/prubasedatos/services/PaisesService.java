package com.bdatos.prubasedatos.services;



import java.util.List;
import java.util.Optional;

import com.bdatos.prubasedatos.entities.PaisesEntity;
import com.bdatos.prubasedatos.responses.PaisesResponse;



public interface PaisesService {
	
	List<PaisesEntity> getAllPaises();
	Optional<PaisesEntity> getUnPais(Integer idpais);
	
	PaisesEntity addModPais(PaisesEntity pais);
	PaisesResponse addModPaisErrores(PaisesEntity pais);
	PaisesResponse elimPais(Integer idpais);
	PaisesResponse pruebaPais(Integer idpais);

}
