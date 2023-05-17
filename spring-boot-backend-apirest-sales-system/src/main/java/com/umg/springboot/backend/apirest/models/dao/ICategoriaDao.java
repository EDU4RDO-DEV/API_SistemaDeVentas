package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long>{

}
