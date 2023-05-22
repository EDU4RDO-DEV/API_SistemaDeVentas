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

import com.umg.springboot.backend.apirest.models.entity.Persona;
import com.umg.springboot.backend.apirest.models.services.IPersonaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaRestController {

	@Autowired
	private IPersonaService personaService;
	
	@GetMapping("/personas/get")
	public List<Persona> index(){
		return personaService.findAll();
	}	
	
	@GetMapping("/personas/get={id}")
	public Persona show(@PathVariable Long id) {
		return personaService.findById(id);
	}
	
	@PostMapping("/personas/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
		
	@PutMapping("/personas/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update(@RequestBody Persona persona, @PathVariable Long id) {
		Persona personaActual = personaService.findById(id);
		personaActual.setNit(persona.getNit());
		personaActual.setDpi(persona.getDpi());
		personaActual.setNombre(persona.getNombre());
		personaActual.setApellido(persona.getApellido());
		personaActual.setTelefono(persona.getTelefono());
		personaActual.setDireccion(persona.getDireccion());
		personaActual.setEstado(persona.getEstado());
		
		return personaService.save(personaActual);	
	}
	
	@DeleteMapping("/personas/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		personaService.delete(id);
	}
	
	@PatchMapping("/personas/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona updatePartial(@RequestBody Persona persona, @PathVariable Long id) {
	    Persona personaActual = personaService.findById(id);
	    Character personaEstado = persona.getEstado();

	    if (personaActual != null) {
	    	if (persona.getNit() != null) {
	    		personaActual.setNit(persona.getNit());
	    	}
	    	
	    	if (persona.getDpi() != null) {
	    		personaActual.setDpi(persona.getDpi());
	    	}
	    	
	    	if (persona.getNombre() != null) {
	    		personaActual.setNombre(persona.getNombre());
	    	}
	    	
	    	if (persona.getApellido() != null) {
	    		personaActual.setApellido(persona.getApellido());
	    	}
	    	
	    	if (persona.getTelefono() != null) {
	    		personaActual.setTelefono(persona.getTelefono());
	    	}
	    	
	    	if (personaEstado != null) {
	    		personaActual.setEstado(persona.getEstado());
	    	}
		    
	        // Actualiza los otros campos si es necesario
	        return personaService.save(personaActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return personaService.save(personaActual);	
    }
}
