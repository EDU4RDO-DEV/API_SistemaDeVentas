package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_almacen")
public class Almacen implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Almacen;
	
	private String Nombre_almacen;
	private String Direccion_almacen;
	private String Telefono_almacen;
	private char Estado;
	
	public int getId_Almacen() {
		return Id_Almacen;
	}

	public void setId_Almacen(int id_Almacen) {
		Id_Almacen = id_Almacen;
	}

	public String getNombre_almacen() {
		return Nombre_almacen;
	}

	public void setNombre_almacen(String nombre_almacen) {
		Nombre_almacen = nombre_almacen;
	}


	public String getTelefono_almacen() {
		return Telefono_almacen;
	}

	public void setTelefono_almacen(String telefono_almacen) {
		Telefono_almacen = telefono_almacen;
	}

	public char getEstado() {
		return Estado;
	}

	public void setEstado(char estado) {
		Estado = estado;
	}

	public String getDireccion_almacen() {
		return Direccion_almacen;
	}

	public void setDireccion_almacen(String direccion_almacen) {
		Direccion_almacen = direccion_almacen;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}