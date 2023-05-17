package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Empleado;

public interface IEmpleadoService {

	public List<Empleado> findAll();
}
