package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="almacen")

public class Almacen implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_almacen;
	
	private String nombre_almacen;
	private String direccion_almacen;
	private String telefono_almacen;
	private char estado;
	
	public int getId_almacen() {
		return id_almacen;
	}

	public void setId_almacen(int id_almacen) {
		this.id_almacen = id_almacen;
	}

	public String getNombre_almacen() {
		return nombre_almacen;
	}

	public void setNombre_almacen(String nombre_almacen) {
		this.nombre_almacen = nombre_almacen;
	}

	public String getDireccion_almacen() {
		return direccion_almacen;
	}

	public void setDireccion_almacen(String direccion_almacen) {
		this.direccion_almacen = direccion_almacen;
	}

	public String getTelefono_almacen() {
		return telefono_almacen;
	}

	public void setTelefono_almacen(String telefono_almacen) {
		this.telefono_almacen = telefono_almacen;
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