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
	
	@Override
	@Transactional(readOnly = true)
	public Devolucion findById(Long id) {
		// TODO Auto-generated method stub
		return devolucionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Devolucion save(Devolucion devolucion) {
		// TODO Auto-generated method stub
		return devolucionDao.save(devolucion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		devolucionDao.deleteById(id);
	}
}
