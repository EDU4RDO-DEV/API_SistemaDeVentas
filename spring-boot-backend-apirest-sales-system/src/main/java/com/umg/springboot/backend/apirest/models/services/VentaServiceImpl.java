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
	
	@Override
	@Transactional(readOnly = true)
	public Venta findById(Long id) {
		// TODO Auto-generated method stub
		return ventaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Venta save(Venta venta) {
		// TODO Auto-generated method stub
		return ventaDao.save(venta);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ventaDao.deleteById(id);
	}
}
