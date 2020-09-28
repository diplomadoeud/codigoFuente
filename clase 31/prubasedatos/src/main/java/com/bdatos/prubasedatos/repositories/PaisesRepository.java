package com.bdatos.prubasedatos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bdatos.prubasedatos.entities.PaisesEntity;


@Repository
public interface PaisesRepository extends CrudRepository<PaisesEntity, Integer> {

}
