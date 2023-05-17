package com.umg.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.springboot.backend.apirest.models.entity.Venta;
import com.umg.springboot.backend.apirest.models.services.IVentaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class VentaRestController {

	@Autowired
	private IVentaService ventaService;
	
	@GetMapping("/ventas")
	public List<Venta> index(){
		return ventaService.findAll();
	}	
}
