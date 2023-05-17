package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.Venta;

public interface IVentaDao extends CrudRepository<Venta, Long>{

}
