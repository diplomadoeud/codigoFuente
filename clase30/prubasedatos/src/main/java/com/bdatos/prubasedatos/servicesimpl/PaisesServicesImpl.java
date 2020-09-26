package com.bdatos.prubasedatos.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdatos.prubasedatos.entities.PaisesEntity;
import com.bdatos.prubasedatos.repositories.PaisesRepository;
import com.bdatos.prubasedatos.services.PaisesService;

@Service
public class PaisesServicesImpl implements PaisesService {
	
	@Autowired
	private PaisesRepository paisesRepository;

	
	@Override
	public List<PaisesEntity> getAllPaises() { 
		return (List<PaisesEntity>) paisesRepository.findAll();
	}

	@Override
	public PaisesEntity getUnPais(Integer idpais) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
