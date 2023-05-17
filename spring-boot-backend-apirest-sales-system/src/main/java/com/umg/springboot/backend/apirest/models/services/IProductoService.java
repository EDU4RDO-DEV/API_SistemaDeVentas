package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
}
