package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import com.umg.springboot.backend.apirest.models.entity.TipoCliente;

public interface ITipoClienteService {

	public List<TipoCliente> findAll();
}
