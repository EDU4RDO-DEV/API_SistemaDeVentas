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
	private int codigo_Empleado;
	
	private int tipoEmpleado_Id_TipoEmpleado;
	private int almacen_Id_Almacen;
	private String usuario;
	private String clave;
	private String estado;
	
	public int getCodigo_Empleado() {
		return codigo_Empleado;
	}

	public void setCodigo_Empleado(int codigo_Empleado) {
		this.codigo_Empleado = codigo_Empleado;
	}

	public int getTipoEmpleado_Id_TipoEmpleado() {
		return tipoEmpleado_Id_TipoEmpleado;
	}

	public void setTipoEmpleado_Id_TipoEmpleado(int tipoEmpleado_Id_TipoEmpleado) {
		this.tipoEmpleado_Id_TipoEmpleado = tipoEmpleado_Id_TipoEmpleado;
	}

	public int getAlmacen_Id_Almacen() {
		return almacen_Id_Almacen;
	}

	public void setAlmacen_Id_Almacen(int almacen_Id_Almacen) {
		this.almacen_Id_Almacen = almacen_Id_Almacen;
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
