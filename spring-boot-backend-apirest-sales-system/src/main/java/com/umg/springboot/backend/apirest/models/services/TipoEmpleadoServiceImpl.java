package com.umg.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.umg.springboot.backend.apirest.models.dao.ITipoEmpleadoDao;
import com.umg.springboot.backend.apirest.models.entity.TipoEmpleado;

@Service
public class TipoEmpleadoServiceImpl implements ITipoEmpleadoService{
	
	@Autowired
	private ITipoEmpleadoDao tipoEmpleadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<TipoEmpleado> findAll() {
		 
		return (List<TipoEmpleado>) tipoEmpleadoDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public TipoEmpleado findById(Long id) {
		// TODO Auto-generated method stub
		return tipoEmpleadoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public TipoEmpleado save(TipoEmpleado tipoEmpleado) {
		// TODO Auto-generated method stub
		return tipoEmpleadoDao.save(tipoEmpleado);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoEmpleadoDao.deleteById(id);
	}
}
