package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")

public class Producto implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_producto;
	
	private int categoria_id_categoria;
	private int proveedor_id_proveedor;
	private int almacen_idAlmacen;
	private String nombre_producto;
	private double precio;
	private int stock;
	private String descripcion;
	private char estado;
	
	public long getId_producto() {
		return id_producto;
	}

	public void setId_producto(long id_producto) {
		this.id_producto = id_producto;
	}

	public int getCategoria_id_categoria() {
		return categoria_id_categoria;
	}

	public void setCategoria_id_categoria(int categoria_id_categoria) {
		this.categoria_id_categoria = categoria_id_categoria;
	}

	public int getProveedor_id_proveedor() {
		return proveedor_id_proveedor;
	}

	public void setProveedor_id_proveedor(int proveedor_id_proveedor) {
		this.proveedor_id_proveedor = proveedor_id_proveedor;
	}

	public int getAlmacen_idAlmacen() {
		return almacen_idAlmacen;
	}

	public void setAlmacen_idAlmacen(int almacen_idAlmacen) {
		this.almacen_idAlmacen = almacen_idAlmacen;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
