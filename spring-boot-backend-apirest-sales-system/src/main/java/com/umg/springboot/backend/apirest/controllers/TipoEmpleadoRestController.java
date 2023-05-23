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

import com.umg.springboot.backend.apirest.models.entity.TipoEmpleado;
import com.umg.springboot.backend.apirest.models.services.ITipoEmpleadoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TipoEmpleadoRestController {

	@Autowired
	private ITipoEmpleadoService tipoEmpleadoService;
	
	@GetMapping("/tipoempleados/get")
	public List<TipoEmpleado> index(){
		return tipoEmpleadoService.findAll();
	}	
	
	@GetMapping("/tipoempleados/get/{id}")
	public TipoEmpleado show(@PathVariable Long id) {
		return tipoEmpleadoService.findById(id);
	}
	
	@PostMapping("/tipoempleados/post")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoEmpleado create(@RequestBody TipoEmpleado tipoEmpleado) {
		return tipoEmpleadoService.save(tipoEmpleado);
	}
	
	@PutMapping("/tipoempleados/put/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoEmpleado update(@RequestBody TipoEmpleado tipoEmpleado, @PathVariable Long id) {
		TipoEmpleado tipoEmpleadoActual = tipoEmpleadoService.findById(id);
		tipoEmpleadoActual.setTipo_empleado(tipoEmpleado.getTipo_empleado());
		tipoEmpleadoActual.setEstado(tipoEmpleado.getEstado());
		return tipoEmpleadoService.save(tipoEmpleadoActual);	
	}
	
	@DeleteMapping("/tipoempleados/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tipoEmpleadoService.delete(id);
	}
	
	@PatchMapping("/tipoempleados/patch/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoEmpleado updatePartial(@RequestBody TipoEmpleado tipoEmpleado, @PathVariable Long id) {
		TipoEmpleado tipoEmpleadoActual = tipoEmpleadoService.findById(id);

	    if (tipoEmpleadoActual != null) {
	    	if (tipoEmpleado.getTipo_empleado() != null) {
	    		tipoEmpleadoActual.setTipo_empleado(tipoEmpleado.getTipo_empleado());
	    	}
	    	
	    	if (tipoEmpleado.getEstado() != 0) {
	    		tipoEmpleadoActual.setEstado(tipoEmpleado.getEstado());
	    	}
		    
	        // Actualiza los otros campos si es necesario
	        return tipoEmpleadoService.save(tipoEmpleadoActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return tipoEmpleadoService.save(tipoEmpleadoActual);	
    }
}
