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

import com.umg.springboot.backend.apirest.models.entity.Categoria;
import com.umg.springboot.backend.apirest.models.services.ICategoriaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CategoriaRestController {

	@Autowired
	private ICategoriaService categoriaService;
	
	@GetMapping("/categorias/get")
	public List<Categoria> index(){
		return categoriaService.findAll();
	}	
	
	@GetMapping("/categorias/get={id}")
	public Categoria show(@PathVariable Long id) {
		return categoriaService.findById(id);
	}
	
	@PostMapping("/categorias/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	
	@PutMapping("/categorias/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id) {
		Categoria categoriaActual = categoriaService.findById(id);
		categoriaActual.setNombre_categoria(categoria.getNombre_categoria());
		categoriaActual.setDescripcion(categoria.getDescripcion());
		categoriaActual.setEstado(categoria.getEstado());	
		return categoriaService.save(categoriaActual);	
	}
	
	@DeleteMapping("/categorias/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		categoriaService.delete(id);
	}
	
	@PatchMapping("/categorias/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria updatePartial(@RequestBody Categoria categoria, @PathVariable Long id) {
	    Categoria categoriaActual = categoriaService.findById(id);
	    Character categoriaEstado = categoria.getEstado();

	    if (categoriaActual != null) {
	    	if (categoria.getNombre_categoria() != null) {
	    		categoriaActual.setNombre_categoria(categoria.getNombre_categoria());
	    	}
	    	
	    	if (categoria.getDescripcion() != null) {
	    		categoriaActual.setDescripcion(categoria.getDescripcion());
	    	}
	    	
	    	if (categoriaEstado != null) {
	    		categoriaActual.setEstado(categoriaEstado.charValue());
	    	}
		    
	        // Actualiza los otros campos si es necesario
	        return categoriaService.save(categoriaActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return categoriaService.save(categoriaActual);	
    }
	
}
