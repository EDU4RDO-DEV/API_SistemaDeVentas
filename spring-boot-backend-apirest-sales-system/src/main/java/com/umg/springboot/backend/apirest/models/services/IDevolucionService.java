package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Devolucion;

public interface IDevolucionService {

	public List<Devolucion> findAll();
}
