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

import com.umg.springboot.backend.apirest.models.entity.Proveedor;
import com.umg.springboot.backend.apirest.models.services.IProveedorService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProveedorRestController {
	
	@Autowired
	private IProveedorService proveedorService;
	
	@GetMapping("/proveedores/get")
	public List<Proveedor> index(){
		return proveedorService.findAll();
	}	
	
	@GetMapping("/proveedores/get={id}")
	public Proveedor show(@PathVariable Long id) {
		return proveedorService.findById(id);
	}
	
	@PostMapping("/proveedores/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Proveedor create(@RequestBody Proveedor proveedor) {
		return proveedorService.save(proveedor);
	}
	
	@PutMapping("/proveedores/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Proveedor update(@RequestBody Proveedor proveedor, @PathVariable Long id) {
		Proveedor proveedorActual = proveedorService.findById(id);
		proveedorActual.setNombre_proveedor(proveedor.getNombre_proveedor());
		proveedorActual.setTelefono_proveedor(proveedor.getTelefono_proveedor());
		proveedorActual.setEstado(proveedor.getEstado());
		return proveedorService.save(proveedorActual);
	}
	
	@DeleteMapping("/proveedores/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		proveedorService.delete(id);
	}
	
	@PatchMapping("/proveedores/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Proveedor updatePartial(@RequestBody Proveedor proveedor, @PathVariable Long id) {
	    Proveedor proveedorActual = proveedorService.findById(id);
	    Character proveedorEstado = proveedor.getEstado();

	    if (proveedorActual != null) {
	    	if (proveedor.getNombre_proveedor() != null) {
	    		proveedorActual.setNombre_proveedor(proveedor.getNombre_proveedor());
	    	}
	    	
	    	if (proveedor.getTelefono_proveedor() != null) {
	    		proveedorActual.setTelefono_proveedor(proveedor.getTelefono_proveedor());
	    	}
	    	
	    	if (proveedorEstado != null) {
	    		proveedorActual.setEstado(proveedorEstado);
	    	}
		    
	        // Actualiza los otros campos si es necesario
	        return proveedorService.save(proveedorActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return proveedorService.save(proveedorActual);	
    }
}
