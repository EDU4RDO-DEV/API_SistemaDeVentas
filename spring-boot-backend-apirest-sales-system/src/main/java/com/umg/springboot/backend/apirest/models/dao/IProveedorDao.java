package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.Proveedor;

public interface IProveedorDao extends CrudRepository<Proveedor, Long>{

}
