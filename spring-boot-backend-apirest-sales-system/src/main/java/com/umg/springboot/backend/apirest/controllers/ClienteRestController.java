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

import com.umg.springboot.backend.apirest.models.entity.Cliente;
import com.umg.springboot.backend.apirest.models.services.IClienteService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes/get")
	public List<Cliente> index(){
		return clienteService.findAll();
	}	
	
	@GetMapping("/clientes/get={id}")
	public Cliente show(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	
	@PostMapping("/clientes/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@PutMapping("/clientes/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente clienteActual = clienteService.findById(id);
		clienteActual.setCodigo_Cliente(cliente.getCodigo_Cliente());
		clienteActual.setId_Persona(cliente.getId_Persona());
		clienteActual.setTipoCliente_Id_TipoCliente(cliente.getTipoCliente_Id_TipoCliente());	
		return clienteService.save(clienteActual);	
	}
	
	@DeleteMapping("/clientes/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
	
	@PatchMapping("/clientes/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente updatePartial(@RequestBody Cliente cliente, @PathVariable Long id) {
	    Cliente clienteActual = clienteService.findById(id);
	    Character clienteEstado = cliente.getEstado();

	    if (clienteActual != null) {
	    	if (cliente.getId_Persona() != 0) {
	    		clienteActual.setId_Persona(cliente.getId_Persona());
	    	}
	    	
	    	if (cliente.getTipoCliente_Id_TipoCliente() != 0) {
	    		clienteActual.setTipoCliente_Id_TipoCliente(cliente.getTipoCliente_Id_TipoCliente());
	    	}
	    	
	    	if (clienteEstado != null) {
	    		clienteActual.setEstado(clienteEstado.charValue());
	    	}
		    
	        // Actualiza los otros campos si es necesario
	        return clienteService.save(clienteActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return clienteService.save(clienteActual);	
    }
}
