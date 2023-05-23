package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Proveedor;

public interface IProveedorService {

	public List<Proveedor> findAll();
	
	public Proveedor findById(Long id);
	
	public Proveedor save(Proveedor proveedor);
	
	public void delete(Long id);
}
