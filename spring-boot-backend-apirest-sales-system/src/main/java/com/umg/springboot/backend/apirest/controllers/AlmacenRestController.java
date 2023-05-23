package com.umg.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.umg.springboot.backend.apirest.models.entity.Almacen;
import com.umg.springboot.backend.apirest.models.services.IAlmacenService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class AlmacenRestController {

	@Autowired
	private IAlmacenService almacenService;
	
	@GetMapping("/almacenes/get")
	public List<Almacen> index(){
		return almacenService.findAll();
	}	
	
	@GetMapping("/almacenes/get={id}")
	public Almacen show(@PathVariable Long id) {
		return almacenService.findById(id);
	}
	
	@PostMapping("/almacenes/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Almacen create(@RequestBody Almacen almacen) {
		return almacenService.save(almacen);
	}
	
	@PutMapping("/almacenes/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Almacen update(@RequestBody Almacen almacen, @PathVariable Long id) {
		Almacen almacenActual = almacenService.findById(id);
	    Character almacenEstado = almacen.getEstado();
		almacenActual.setNombre_almacen(almacen.getNombre_almacen());
		almacenActual.setDireccion_almacen(almacen.getDireccion_almacen());
		almacenActual.setTelefono_almacen(almacen.getTelefono_almacen());
		almacenActual.setEstado(almacenEstado);
		return almacenService.save(almacenActual);	
	}
	
	@DeleteMapping("/almacenes/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		almacenService.delete(id);
	}
	
	@PatchMapping("/almacenes/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Almacen updatePartial(@RequestBody Almacen almacen, @PathVariable Long id) {
		Almacen almacenActual = almacenService.findById(id);
	    Character almacenEstado = almacen.getEstado();

	    if (almacenActual != null) {
	    	if (almacen.getNombre_almacen() != null) {
	    		almacenActual.setNombre_almacen(almacen.getNombre_almacen());
	    	}
	    	
	    	if (almacen.getDireccion_almacen() != null) {
	    		almacenActual.setDireccion_almacen(almacen.getDireccion_almacen());
	    	}
	    	
	    	if (almacen.getTelefono_almacen() != null) {
	    		almacenActual.setTelefono_almacen(almacen.getTelefono_almacen());
	    	}
		    
	    	if (almacenEstado != null) {
	    		almacenActual.setEstado(almacenEstado);
	    	}
	        // Actualiza los otros campos si es necesario
	        return almacenService.save(almacenActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return almacenService.save(almacenActual);	
    }
}
