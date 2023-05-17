package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.Devolucion;

public interface IDevolucionDao extends CrudRepository<Devolucion, Long>{

}
