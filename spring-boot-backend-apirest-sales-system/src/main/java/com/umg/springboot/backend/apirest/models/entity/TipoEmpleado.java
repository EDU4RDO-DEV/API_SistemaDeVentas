package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_tipoempleado")
public class TipoEmpleado implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_TipoEmpleado;
	
	private String Tipo_empleado;
	private char Estado;
	
	public int getId_TipoEmpleado() {
		return Id_TipoEmpleado;
	}

	public void setId_TipoEmpleado(int id_TipoEmpleado) {
		Id_TipoEmpleado = id_TipoEmpleado;
	}

	public String getTipo_empleado() {
		return Tipo_empleado;
	}

	public void setTipo_empleado(String tipo_empleado) {
		Tipo_empleado = tipo_empleado;
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
