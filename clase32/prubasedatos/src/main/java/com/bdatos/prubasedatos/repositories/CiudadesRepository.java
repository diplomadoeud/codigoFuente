package com.bdatos.prubasedatos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bdatos.prubasedatos.entities.CiudadesEntity;

@Repository
public interface CiudadesRepository extends CrudRepository<CiudadesEntity, Long> {

}
