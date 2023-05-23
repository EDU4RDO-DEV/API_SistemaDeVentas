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

import com.umg.springboot.backend.apirest.models.entity.Venta;
import com.umg.springboot.backend.apirest.models.services.IVentaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class VentaRestController {

	@Autowired
	private IVentaService ventaService;
	
	@GetMapping("/ventas/get")
	public List<Venta> index(){
		return ventaService.findAll();
	}	
	
	@GetMapping("/ventas/get={id}")
	public Venta show(@PathVariable Long id) {
		return ventaService.findById(id);
	}
	
	@PostMapping("/ventas/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta create(@RequestBody Venta venta) {
		return ventaService.save(venta);
	}
	
	@PutMapping("/ventas/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta update(@RequestBody Venta venta, @PathVariable Long id) {
		Venta ventaActual = ventaService.findById(id);
		ventaActual.setCliente_Codigo_Cliente(venta.getCliente_Codigo_Cliente());
		ventaActual.setEmpleado_Codigo_Empleado(venta.getEmpleado_Codigo_Empleado());
		ventaActual.setNumero_venta(venta.getNumero_venta());
		ventaActual.setFecha_vneta(venta.getFecha_vneta());
		ventaActual.setMonto(venta.getMonto());
		ventaActual.setEstado(venta.getEstado());
		return ventaService.save(ventaActual);	
	}
	
	@DeleteMapping("/ventas/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ventaService.delete(id);
	}
	
	@PatchMapping("/ventas/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Venta updatePartial(@RequestBody Venta venta, @PathVariable Long id) {
	    Venta ventaActual = ventaService.findById(id);
	    Character ventaEstado = venta.getEstado();

	    if (ventaActual != null) {
	    	if (venta.getCliente_Codigo_Cliente() != null) {
	    		ventaActual.setCliente_Codigo_Cliente(venta.getCliente_Codigo_Cliente());
	    	}
	    	
	    	if (venta.getEmpleado_Codigo_Empleado() != 0) {
	    		ventaActual.setEmpleado_Codigo_Empleado(venta.getEmpleado_Codigo_Empleado());
	    	}
	    	
	    	if (venta.getNumero_venta() != null) {
	    		ventaActual.setNumero_venta(venta.getNumero_venta());
	    	}
	    	
	    	if (venta.getFecha_vneta() != null) {
	    		ventaActual.setFecha_vneta(venta.getFecha_vneta());
	    	}
	    	
	    	if (venta.getMonto() != 0) {
	    		ventaActual.setMonto(venta.getMonto());
	    	}
	    	
	    	if (ventaEstado != 0) {
	    		ventaActual.setEstado(ventaEstado);
	    	}
		    
	        // Actualiza los otros campos si es necesario
	        return ventaService.save(ventaActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return ventaService.save(ventaActual);	
    }
}
