package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.TipoEmpleado;

public interface ITipoEmpleadoDao extends CrudRepository<TipoEmpleado, Long>{

}
