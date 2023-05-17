package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_persona;
	private int codigo_empleado;
	
	private int tipoEmpleado_id_tipoEmpleado;
	private int almacen_id_almacen;
	private String usuario;
	private String clave;
	private char estado;
	
	public int getId_persona() {
		return id_persona;
	}
	
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public int getCodigo_empleado() {
		return codigo_empleado;
	}

	public void setCodigo_empleado(int codigo_empleado) {
		this.codigo_empleado = codigo_empleado;
	}

	public int getTipoEmpleado_id_tipoEmpleado() {
		return tipoEmpleado_id_tipoEmpleado;
	}
	
	public void setTipoEmpleado_id_tipoEmpleado(int tipoEmpleado_id_tipoEmpleado) {
		this.tipoEmpleado_id_tipoEmpleado = tipoEmpleado_id_tipoEmpleado;
	}
	
	public int getAlmacen_id_almacen() {
		return almacen_id_almacen;
	}

	public void setAlmacen_id_almacen(int almacen_id_almacen) {
		this.almacen_id_almacen = almacen_id_almacen;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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
