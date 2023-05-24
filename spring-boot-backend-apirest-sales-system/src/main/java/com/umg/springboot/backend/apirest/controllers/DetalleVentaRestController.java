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

import com.umg.springboot.backend.apirest.models.entity.DetalleVenta;
import com.umg.springboot.backend.apirest.models.services.IDetalleVentaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DetalleVentaRestController {

	@Autowired
	private IDetalleVentaService detalleVentaService;
	
	@GetMapping("/detalleventas/get")
	public List<DetalleVenta> index(){
		return detalleVentaService.findAll();
	}	
	
	@GetMapping("/detalleventas/get={id}")
	public DetalleVenta show(@PathVariable Long id) {
		return detalleVentaService.findById(id);
	}
	
	@PostMapping("/detalleventas/post")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleVenta create(@RequestBody DetalleVenta detalleVenta) {
		return detalleVentaService.save(detalleVenta);
	}
	
	@PutMapping("/detalleventas/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleVenta update(@RequestBody DetalleVenta detalleVenta, @PathVariable Long id) {
		DetalleVenta detalleVentaActual = detalleVentaService.findById(id);
		detalleVentaActual.setVenta_Id_venta(detalleVenta.getVenta_Id_venta());
		detalleVentaActual.setProducto_Id_Producto(detalleVenta.getProducto_Id_Producto());
		detalleVentaActual.setCantidad(detalleVenta.getCantidad());
		detalleVentaActual.setPrecio_venta(detalleVenta.getPrecio_venta());
		return detalleVentaService.save(detalleVenta);
	}
	
	@DeleteMapping("/detalleventas/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		detalleVentaService.delete(id);
	}
	
	@PatchMapping("/detalleventas/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleVenta updatePartial(@RequestBody DetalleVenta detalleVenta, @PathVariable Long id) {
		DetalleVenta detalleVentaActual = detalleVentaService.findById(id);

	    if (detalleVentaActual != null) {
	    	if (detalleVenta.getVenta_Id_venta() != 0) {
	    		detalleVentaActual.setVenta_Id_venta(detalleVenta.getVenta_Id_venta());
	    	}
	    	
	    	if (detalleVenta.getProducto_Id_Producto() != 0) {
	    		detalleVentaActual.setProducto_Id_Producto(detalleVenta.getProducto_Id_Producto());
	    	}
	    	
	    	if (detalleVenta.getCantidad() != 0) {
	    		detalleVentaActual.setCantidad(detalleVenta.getCantidad());
	    	}
		    
	    	if (detalleVenta.getPrecio_venta() != 0) {
	    		detalleVentaActual.setPrecio_venta(detalleVenta.getPrecio_venta());
	    	}
	        // Actualiza los otros campos si es necesario
	        return detalleVentaService.save(detalleVentaActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return detalleVentaService.save(detalleVentaActual);	
    }
}
