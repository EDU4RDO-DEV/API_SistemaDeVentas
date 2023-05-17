package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.umg.springboot.backend.apirest.models.dao.IProveedorDao;
import com.umg.springboot.backend.apirest.models.entity.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{

	@Autowired
	private IProveedorDao proveedorDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Proveedor> findAll() {
		 
		return (List<Proveedor>) proveedorDao.findAll();
	}
}
