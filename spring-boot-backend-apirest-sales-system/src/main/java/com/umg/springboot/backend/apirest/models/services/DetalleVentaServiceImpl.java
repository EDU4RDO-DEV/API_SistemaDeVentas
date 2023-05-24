package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.umg.springboot.backend.apirest.models.dao.IDetalleVentaDao;
import com.umg.springboot.backend.apirest.models.entity.DetalleVenta;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{

	@Autowired
	private IDetalleVentaDao detalleVentaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<DetalleVenta> findAll() {
		 
		return (List<DetalleVenta>) detalleVentaDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public DetalleVenta findById(Long id) {
		// TODO Auto-generated method stub
		return detalleVentaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public DetalleVenta save(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		return detalleVentaDao.save(detalleVenta);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		detalleVentaDao.deleteById(id);
	}
}
