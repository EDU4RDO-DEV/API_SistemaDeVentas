package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Proveedor;

public interface IProveedorService {

	public List<Proveedor> findAll();
}
