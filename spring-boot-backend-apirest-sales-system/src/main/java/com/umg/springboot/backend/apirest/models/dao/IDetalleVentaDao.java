package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.DetalleVenta;

public interface IDetalleVentaDao extends CrudRepository<DetalleVenta, Long>{

}
