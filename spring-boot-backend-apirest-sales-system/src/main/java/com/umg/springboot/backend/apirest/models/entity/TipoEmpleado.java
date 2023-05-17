package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoEmpleado")
public class TipoEmpleado implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_TipoEmpleado;
	
	private String tipo_Empleado;
	private String estado;

	public int getId_TipoEmpleado() {
		return id_TipoEmpleado;
	}

	public void setId_TipoEmpleado(int id_TipoEmpleado) {
		this.id_TipoEmpleado = id_TipoEmpleado;
	}

	public String getTipo_Empleado() {
		return tipo_Empleado;
	}

	public void setTipo_Empleado(String tipo_Empleado) {
		this.tipo_Empleado = tipo_Empleado;
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
