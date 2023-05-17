package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Categoria;

public interface ICategoriaService {

	public List<Categoria> findAll();
}
