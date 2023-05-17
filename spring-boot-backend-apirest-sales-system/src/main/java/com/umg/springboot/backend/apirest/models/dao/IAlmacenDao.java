package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.Almacen;

public interface IAlmacenDao extends CrudRepository<Almacen, Long> {

}
