package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_categoria")

public class Categoria implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Categoria;
	
	private String Nombre_categoria;
	private String Descripcion;
	private char Estado;

	public int getId_Categoria() {
		return Id_Categoria;
	}

	public void setId_Categoria(int id_Categoria) {
		Id_Categoria = id_Categoria;
	}

	public String getNombre_categoria() {
		return Nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		Nombre_categoria = nombre_categoria;
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
