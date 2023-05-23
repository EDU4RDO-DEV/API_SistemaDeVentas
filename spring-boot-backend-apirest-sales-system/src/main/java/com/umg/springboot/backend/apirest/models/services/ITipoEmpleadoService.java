package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.TipoEmpleado;

public interface ITipoEmpleadoService {

	public List<TipoEmpleado> findAll();
	
	public TipoEmpleado findById(Long id);
	
	public TipoEmpleado save(TipoEmpleado tipoEmpleado);
	
	public void delete(Long id);
}
