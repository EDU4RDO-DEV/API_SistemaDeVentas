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

import com.umg.springboot.backend.apirest.models.entity.Producto;
import com.umg.springboot.backend.apirest.models.services.IProductoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductoRestController {

	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/productos/get")
	public List<Producto> index(){
		return productoService.findAll();
	}
	
	@GetMapping("/productos/get={id}")
	public Producto show(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	@PostMapping("/productos/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@PutMapping("/productos/put={id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		Producto productoActual = productoService.findById(id);
	    Character productoEstado = producto.getEstado();

		productoActual.setCategoria_Id_Categoria(producto.getCategoria_Id_Categoria());
		productoActual.setProveedor_Id_Proveedor(producto.getProveedor_Id_Proveedor());
		productoActual.setAlmace_id_almacen(producto.getAlmace_id_almacen());
		productoActual.setNombre_producto(producto.getNombre_producto());
		productoActual.setPrecio(producto.getPrecio());
		productoActual.setStock(producto.getStock());
		productoActual.setDescripcion(producto.getDescripcion());
		productoActual.setEstado(productoEstado);
		return productoService.save(productoActual);	
	}
	
	@DeleteMapping("/productos/delete={id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		productoService.delete(id);
	}
	
	@PatchMapping("/productos/patch={id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto updatePartial(@RequestBody Producto producto, @PathVariable Long id) {
		Producto productoActual = productoService.findById(id);
	    Character productoEstado = producto.getEstado();

	    if (productoActual != null) {
	    	if (producto.getCategoria_Id_Categoria() != 0) {
	    		productoActual.setCategoria_Id_Categoria(producto.getCategoria_Id_Categoria());
	    	}
	    	
	    	if (producto.getProveedor_Id_Proveedor() != 0) {
	    		productoActual.setProveedor_Id_Proveedor(producto.getProveedor_Id_Proveedor());
	    	}
	    	
	    	if (producto.getAlmace_id_almacen() != 0) {
	    		productoActual.setAlmace_id_almacen(producto.getAlmace_id_almacen());
	    	}
		    
	    	if (producto.getNombre_producto() != null) {
	    		productoActual.setNombre_producto(producto.getNombre_producto());
	    	}
	    	
	    	if (producto.getPrecio() != 0) {
	    		productoActual.setPrecio(producto.getPrecio());
	    	}
	    	
	    	if (producto.getStock() != 0) {
	    		productoActual.setStock(producto.getStock());
	    	}
	    	
	    	if (producto.getDescripcion() != null) {
	    		productoActual.setDescripcion(producto.getDescripcion());
	    	}
	    	
	    	if (productoEstado != 0) {
	    		productoActual.setEstado(productoEstado);
	    	}
	        // Actualiza los otros campos si es necesario
	        return productoService.save(productoActual);
	    } else {
	    	// Manejar la situación cuando el cliente no existe
	        // Puedes lanzar una excepción, devolver un error personalizado, etc.
	    }
	    
	    return productoService.save(productoActual);	
    }
}
