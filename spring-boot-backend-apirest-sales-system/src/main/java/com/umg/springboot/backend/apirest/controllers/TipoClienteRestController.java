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

import com.umg.springboot.backend.apirest.models.entity.TipoCliente;
import com.umg.springboot.backend.apirest.models.services.ITipoClienteService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TipoClienteRestController {

	@Autowired
	private ITipoClienteService tipoClienteService;
	
	@GetMapping("/tipoclientes/get")
	public List<TipoCliente> index(){
		return tipoClienteService.findAll();
	}	
	
	@GetMapping("/tipoclientes/get={id}")
	public TipoCliente show(@PathVariable Long id) {
		return tipoClienteService.findById(id);
	}
	
	@PostMapping("/tipoclientes/post")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoCliente create(@RequestBody TipoCliente tipoCliente) {
		return tipoClienteService.save(tipoCliente);
	}
	
	@PutMapping("/tipoclientes/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoCliente update(@RequestBody TipoCliente tipoCliente, @PathVariable Long id) {
		TipoCliente tipoClienteActual = tipoClienteService.findById(id);
		tipoClienteActual.setTipo_cliente(tipoCliente.getTipo_cliente());
		tipoClienteActual.setDescuento(tipoCliente.getDescuento());	
		return tipoClienteService.save(tipoClienteActual);	
	}
	
	@DeleteMapping("/tipoclientes/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tipoClienteService.delete(id);
	}
	
	@PatchMapping("/tipoclientes/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoCliente updatePartial(@RequestBody TipoCliente tipoCliente, @PathVariable Long id) {
		TipoCliente tipoClienteActual = tipoClienteService.findById(id);

	    if (tipoClienteActual != null) {
	    	if (tipoCliente.getTipo_cliente() != 0) {
	    		tipoClienteActual.setTipo_cliente(tipoCliente.getTipo_cliente());
	    	}
	    	
	    	if (tipoCliente.getDescuento() != 0) {
	    		tipoClienteActual.setDescuento(tipoCliente.getTipo_cliente());
	    	}
		    
	        // Actualiza los otros campos si es necesario
	        return tipoClienteService.save(tipoClienteActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return tipoClienteService.save(tipoClienteActual);	
    }
}
