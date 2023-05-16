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
	private int id_Almacen;
	
	private String nombre_Almacen;
	private String direccion_Almacen;
	private String telefono_Almacen;
	private String estado;
	
	public int getId_Almacen() {
		return id_Almacen;
	}

	public void setId_Almacen(int id_Almacen) {
		this.id_Almacen = id_Almacen;
	}

	public String getNombre_Almacen() {
		return nombre_Almacen;
	}

	public void setNombre_Almacen(String nombre_Almacen) {
		this.nombre_Almacen = nombre_Almacen;
	}

	public String getDireccion_Almacen() {
		return direccion_Almacen;
	}

	public void setDireccion_Almacen(String direccion_Almacen) {
		this.direccion_Almacen = direccion_Almacen;
	}

	public String getTelefono_Almacen() {
		return telefono_Almacen;
	}

	public void setTelefono_Almacen(String telefono_Almacen) {
		this.telefono_Almacen = telefono_Almacen;
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