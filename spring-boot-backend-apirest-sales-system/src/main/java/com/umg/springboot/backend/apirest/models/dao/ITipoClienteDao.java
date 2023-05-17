package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.TipoCliente;

public interface ITipoClienteDao extends CrudRepository<TipoCliente, Long>{

}
