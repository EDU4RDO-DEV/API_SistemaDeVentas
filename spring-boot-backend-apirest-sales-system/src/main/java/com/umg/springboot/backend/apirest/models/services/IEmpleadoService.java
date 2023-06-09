package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.Empleado;

public interface IEmpleadoService {

	public List<Empleado> findAll();
	
	public Empleado findById(Long id);
	
	public Empleado save(Empleado venta);
	
	public void delete(Long id);
}
