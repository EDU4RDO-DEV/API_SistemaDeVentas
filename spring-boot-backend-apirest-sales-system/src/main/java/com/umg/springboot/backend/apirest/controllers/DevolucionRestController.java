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

import com.umg.springboot.backend.apirest.models.entity.Devolucion;
import com.umg.springboot.backend.apirest.models.services.IDevolucionService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DevolucionRestController {

	@Autowired
	private IDevolucionService devolucionService;
	
	@GetMapping("/devoluciones")
	public List<Devolucion> index(){
		return devolucionService.findAll();
	}
	
	@GetMapping("/devoluciones/get={id}")
	public Devolucion show(@PathVariable Long id) {
		return devolucionService.findById(id);
	}
	
	@PostMapping("/devoluciones/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Devolucion create(@RequestBody Devolucion devolucion) {
		return devolucionService.save(devolucion);
	}
	
	@PutMapping("/devoluciones/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Devolucion update(@RequestBody Devolucion devolucion, @PathVariable Long id) {
		Devolucion devolucionActual = devolucionService.findById(id);
	    devolucionActual.setDetalleVenta_IdDetalleVenta(devolucion.getDetalleVenta_IdDetalleVenta());
	    devolucionActual.setDetalleVenta_IdProducto(devolucion.getDetalleVenta_IdProducto());
	    devolucionActual.setMotivo(devolucion.getMotivo());
	    devolucionActual.setFecha_devolucion(devolucion.getFecha_devolucion());
	    devolucionActual.setCantidad(devolucion.getCantidad());
		return devolucionService.save(devolucionActual);
	}
	
	@DeleteMapping("/devoluciones/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		devolucionService.delete(id);
	}
	
	@PatchMapping("/devoluciones/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Devolucion updatePartial(@RequestBody Devolucion devolucion, @PathVariable Long id) {
		Devolucion devolucionActual = devolucionService.findById(id);

	    if (devolucionActual != null) {
	    	if (devolucion.getDetalleVenta_IdDetalleVenta() != 0) {
	    		devolucionActual.setDetalleVenta_IdDetalleVenta(devolucion.getDetalleVenta_IdDetalleVenta());
	    	}
	    	
	    	if (devolucion.getDetalleVenta_IdProducto() != 0) {
	    		devolucionActual.setDetalleVenta_IdProducto(devolucion.getDetalleVenta_IdProducto());
	    	}
	    	
	    	if (devolucion.getMotivo() != null) {
	    		devolucionActual.setMotivo(devolucion.getMotivo());
	    	}
		    
	    	if (devolucion.getFecha_devolucion() != null) {
	    		devolucionActual.setFecha_devolucion(devolucion.getFecha_devolucion());
	    	}
	    	
	    	if (devolucion.getCantidad() != 0) {
	    		devolucionActual.setCantidad(devolucion.getCantidad());
	    	}
	    	
	    	
	        // Actualiza los otros campos si es necesario
	        return devolucionService.save(devolucionActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return devolucionService.save(devolucionActual);	
    }
}