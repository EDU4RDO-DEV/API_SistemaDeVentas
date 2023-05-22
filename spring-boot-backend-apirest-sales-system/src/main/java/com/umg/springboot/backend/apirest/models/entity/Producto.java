package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_producto")

public class Producto implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_Producto;
	
	private int Categoria_Id_Categoria;
	private int Proveedor_Id_Proveedor;
	private int Almace_IdAlmacen;
	private String Nombre_producto;
	private double Precio;
	private int Stock;
	private String Descripcion;
	private char Estado;
	
	public long getId_Producto() {
		return Id_Producto;
	}

	public void setId_Producto(long id_Producto) {
		Id_Producto = id_Producto;
	}

	public int getCategoria_Id_Categoria() {
		return Categoria_Id_Categoria;
	}

	public void setCategoria_Id_Categoria(int categoria_Id_Categoria) {
		Categoria_Id_Categoria = categoria_Id_Categoria;
	}

	public int getProveedor_Id_Proveedor() {
		return Proveedor_Id_Proveedor;
	}

	public void setProveedor_Id_Proveedor(int proveedor_Id_Proveedor) {
		Proveedor_Id_Proveedor = proveedor_Id_Proveedor;
	}

	public int getAlmace_IdAlmacen() {
		return Almace_IdAlmacen;
	}

	public void setAlmace_IdAlmacen(int almace_IdAlmacen) {
		Almace_IdAlmacen = almace_IdAlmacen;
	}

	public String getNombre_producto() {
		return Nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		Nombre_producto = nombre_producto;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public char getEstado() {
		return Estado;
	}

	public void setEstado(char estado) {
		Estado = estado;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
