package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.DetalleVenta;

public interface IDetalleVentaService {

	public List<DetalleVenta> findAll();
	
	public DetalleVenta findById(Long id);
	
	public DetalleVenta save(DetalleVenta detalleVenta);
	
	public void delete(Long id);
}
