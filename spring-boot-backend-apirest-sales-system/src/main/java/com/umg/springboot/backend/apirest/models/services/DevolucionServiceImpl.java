package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.umg.springboot.backend.apirest.models.dao.IDevolucionDao;
import com.umg.springboot.backend.apirest.models.entity.Devolucion;

@Service
public class DevolucionServiceImpl implements IDevolucionService{

	@Autowired
	private IDevolucionDao devolucionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Devolucion> findAll() {
		 
		return (List<Devolucion>) devolucionDao.findAll();
	}
}
