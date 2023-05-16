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
	private int id_Producto;
	
	private int categoria_Id_Categoria;
	private int proveedor_Id_Proveedor;
	private int almacen_IdAlmacen;
	private String nombre_Producto;
	private double precio;
	private int stock;
	private String descripcion;
	private String estado;
	
	public int getId_Producto() {
		return id_Producto;
	}
	
	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}
	
	public int getCategoria_Id_Categoria() {
		return categoria_Id_Categoria;
	}
	
	public void setCategoria_Id_Categoria(int categoria_Id_Categoria) {
		this.categoria_Id_Categoria = categoria_Id_Categoria;
	}
	
	public int getProveedor_Id_Proveedor() {
		return proveedor_Id_Proveedor;
	}
	
	public void setProveedor_Id_Proveedor(int proveedor_Id_Proveedor) {
		this.proveedor_Id_Proveedor = proveedor_Id_Proveedor;
	}
	
	public int getAlmacen_IdAlmacen() {
		return almacen_IdAlmacen;
	}
	
	public void setAlmacen_IdAlmacen(int almacen_IdAlmacen) {
		this.almacen_IdAlmacen = almacen_IdAlmacen;
	}
	
	public String getNombre_Producto() {
		return nombre_Producto;
	}
	
	public void setNombre_Producto(String nombre_Producto) {
		this.nombre_Producto = nombre_Producto;
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
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
