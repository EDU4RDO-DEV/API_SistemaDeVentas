package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.umg.springboot.backend.apirest.models.dao.IVentaDao;
import com.umg.springboot.backend.apirest.models.entity.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaDao ventaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Venta> findAll() {
		 
		return (List<Venta>) ventaDao.findAll();
	}
}
