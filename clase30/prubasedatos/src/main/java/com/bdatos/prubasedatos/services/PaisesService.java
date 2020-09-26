package com.bdatos.prubasedatos.services;



import java.util.List;

import com.bdatos.prubasedatos.entities.PaisesEntity;



public interface PaisesService {
	
	List<PaisesEntity> getAllPaises();
	PaisesEntity getUnPais(Integer idpais);


}
