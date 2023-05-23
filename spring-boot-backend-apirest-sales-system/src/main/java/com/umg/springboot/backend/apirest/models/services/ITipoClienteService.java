package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.TipoCliente;

public interface ITipoClienteService {

	public List<TipoCliente> findAll();
	
	public TipoCliente findById(Long id);
	
	public TipoCliente save(TipoCliente tipoCliente);
	
	public void delete(Long id);
}
