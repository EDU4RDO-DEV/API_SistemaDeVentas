package com.umg.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.umg.springboot.backend.apirest.models.entity.Empleado;

public interface ITipoEmpleadoDao extends CrudRepository<Empleado, Long>{

}
