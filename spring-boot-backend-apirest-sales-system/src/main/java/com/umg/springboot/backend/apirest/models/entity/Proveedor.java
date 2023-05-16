package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedor")

public class Proveedor implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Proveedor;
	
	private String nombre_Proveedor;
	private String telefono_Proveedor;
	private String estado;
	
	public int getId_Proveedor() {
		return id_Proveedor;
	}
	
	public void setId_Proveedor(int id_Proveedor) {
		this.id_Proveedor = id_Proveedor;
	}
	
	public String getNombre_Proveedor() {
		return nombre_Proveedor;
	}
	
	public void setNombre_Proveedor(String nombre_Proveedor) {
		this.nombre_Proveedor = nombre_Proveedor;
	}
	
	public String getTelefono_Proveedor() {
		return telefono_Proveedor;
	}
	
	public void setTelefono_Proveedor(String telefono_Proveedor) {
		this.telefono_Proveedor = telefono_Proveedor;
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