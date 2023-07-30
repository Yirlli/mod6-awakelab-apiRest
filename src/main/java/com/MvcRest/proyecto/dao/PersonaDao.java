package com.MvcRest.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import com.MvcRest.proyecto.model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{

}
