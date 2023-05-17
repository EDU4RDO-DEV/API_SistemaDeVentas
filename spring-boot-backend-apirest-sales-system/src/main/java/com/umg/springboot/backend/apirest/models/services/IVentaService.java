package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Venta;

public interface IVentaService {

	public List<Venta> findAll();
}
