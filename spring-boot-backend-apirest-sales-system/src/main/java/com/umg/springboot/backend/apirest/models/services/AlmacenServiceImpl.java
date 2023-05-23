package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.umg.springboot.backend.apirest.models.dao.IAlmacenDao;
import com.umg.springboot.backend.apirest.models.entity.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	private IAlmacenDao almacenDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Almacen> findAll() {
		 
		return (List<Almacen>) almacenDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Almacen findById(Long id) {
		// TODO Auto-generated method stub
		return almacenDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Almacen save(Almacen almacen) {
		// TODO Auto-generated method stub
		return almacenDao.save(almacen);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenDao.deleteById(id);
	}
}
