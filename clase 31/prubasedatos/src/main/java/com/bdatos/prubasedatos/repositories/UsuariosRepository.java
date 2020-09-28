package com.bdatos.prubasedatos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bdatos.prubasedatos.entities.UsuariosEntity;

@Repository
public interface UsuariosRepository extends CrudRepository<UsuariosEntity, Long> {

}
