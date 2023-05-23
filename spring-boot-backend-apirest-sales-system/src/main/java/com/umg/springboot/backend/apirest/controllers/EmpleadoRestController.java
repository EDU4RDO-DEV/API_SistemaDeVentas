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

import com.umg.springboot.backend.apirest.models.entity.Empleado;
import com.umg.springboot.backend.apirest.models.services.IEmpleadoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

	@Autowired
	private IEmpleadoService empleadoService;
	
	@GetMapping("/empleados/get")
	public List<Empleado> index(){
		return empleadoService.findAll();
	}	
	
	@GetMapping("/empleados/get={id}")
	public Empleado show(@PathVariable Long id) {
		return empleadoService.findById(id);
	}
	
	@PostMapping("/empleados/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado create(@RequestBody Empleado empleado) {
		return empleadoService.save(empleado);
	}
	
	@PutMapping("/empleados/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado update(@RequestBody Empleado empleado, @PathVariable Long id) {
		Empleado empleadoActual = empleadoService.findById(id);
		empleadoActual.setId_Persona(empleado.getId_Persona());
		empleadoActual.setTipoEmpleado_Id_TipoEmpleado(empleado.getTipoEmpleado_Id_TipoEmpleado());
		empleadoActual.setAlmacen_Id_Almacen(empleado.getAlmacen_Id_Almacen());
		empleadoActual.setUsuario(empleado.getUsuario());
		empleadoActual.setClave(empleado.getClave());
		empleadoActual.setEstado(empleado.getEstado());
		return empleadoService.save(empleadoActual);	
	}
	
	@DeleteMapping("/empleados/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		empleadoService.delete(id);
	}
	
	@PatchMapping("/empleados/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado updatePartial(@RequestBody Empleado empleado, @PathVariable Long id) {
		Empleado empleadoActual = empleadoService.findById(id);
	    Character empleadoEstado = empleado.getEstado();

	    if (empleadoActual != null) {
	    	if (empleado.getId_Persona() != 0) {
	    		empleadoActual.setId_Persona(empleado.getId_Persona());
	    	}
	    	
	    	if (empleado.getTipoEmpleado_Id_TipoEmpleado() != 0) {
	    		empleadoActual.setTipoEmpleado_Id_TipoEmpleado(empleado.getTipoEmpleado_Id_TipoEmpleado());
	    	}
	    	
	    	if (empleado.getAlmacen_Id_Almacen() != 0) {
	    		empleadoActual.setAlmacen_Id_Almacen(empleado.getAlmacen_Id_Almacen());
	    	}
		    
	    	if (empleado.getUsuario() != null) {
	    		empleadoActual.setUsuario(empleado.getUsuario());
	    	}
	    	
	    	if (empleado.getClave() != null) {
	    		empleadoActual.setClave(empleado.getClave());
	    	}
	    	
	    	if (empleadoEstado != null) {
	    		empleadoActual.setEstado(empleadoEstado);
	    	}
	        // Actualiza los otros campos si es necesario
	        return empleadoService.save(empleadoActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return empleadoService.save(empleadoActual);	
    }
}
