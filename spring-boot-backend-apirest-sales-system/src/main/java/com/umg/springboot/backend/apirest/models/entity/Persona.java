package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_persona")

public class Persona implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Persona;
	
	private String Nit;
	private String Dpi;
	private String Nombre;
	private String Apellido;
	private String Telefono;
	private String Direccion;
	private char Estado;
	
	public int getId_Persona() {
		return Id_Persona;
	}

	public void setId_Persona(int id_Persona) {
		Id_Persona = id_Persona;
	}

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}

	public String getDpi() {
		return Dpi;
	}

	public void setDpi(String dpi) {
		Dpi = dpi;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
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
