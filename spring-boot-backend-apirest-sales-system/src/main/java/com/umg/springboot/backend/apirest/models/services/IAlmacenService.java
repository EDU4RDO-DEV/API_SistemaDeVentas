package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Almacen;

public interface IAlmacenService {
	
	public List<Almacen> findAll();
	
}
