package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.umg.springboot.backend.apirest.models.dao.ITipoClienteDao;
import com.umg.springboot.backend.apirest.models.entity.TipoCliente;

@Service
public class TipoClienteServiceImpl implements ITipoClienteService{

	@Autowired
	private ITipoClienteDao tipoClienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<TipoCliente> findAll() {
		 
		return (List<TipoCliente>) tipoClienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public TipoCliente findById(Long id) {
		// TODO Auto-generated method stub
		return tipoClienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public TipoCliente save(TipoCliente tipoCliente) {
		// TODO Auto-generated method stub
		return tipoClienteDao.save(tipoCliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoClienteDao.deleteById(id);
	}
}
