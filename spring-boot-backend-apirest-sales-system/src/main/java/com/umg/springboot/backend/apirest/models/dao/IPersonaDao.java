package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{

}
