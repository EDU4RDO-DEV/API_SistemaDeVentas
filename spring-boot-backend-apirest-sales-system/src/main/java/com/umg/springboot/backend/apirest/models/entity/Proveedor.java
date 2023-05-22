package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_proveedor")

public class Proveedor implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Proveedor;
	
	private String Nombre_proveedor;
	private String Telefono_proveedor;
	private char Estado;
	
	public int getId_Proveedor() {
		return Id_Proveedor;
	}

	public void setId_Proveedor(int id_Proveedor) {
		Id_Proveedor = id_Proveedor;
	}

	public String getNombre_proveedor() {
		return Nombre_proveedor;
	}

	public void setNombre_proveedor(String nombre_proveedor) {
		Nombre_proveedor = nombre_proveedor;
	}

	public String getTelefono_proveedor() {
		return Telefono_proveedor;
	}

	public void setTelefono_proveedor(String telefono_proveedor) {
		Telefono_proveedor = telefono_proveedor;
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