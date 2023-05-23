package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_empleado")
public class Empleado implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Codigo_Empleado;
	
	private int Id_Persona;
	private int TipoEmpleado_Id_TipoEmpleado;
	private int Almacen_Id_Almacen;
	private String Usuario;
	private String Clave;
	private char Estado;
	
	public int getCodigo_Empleado() {
		return Codigo_Empleado;
	}

	public void setCodigo_Empleado(int codigo_Empleado) {
		Codigo_Empleado = codigo_Empleado;
	}
	
	public int getId_Persona() {
		return Id_Persona;
	}

	public void setId_Persona(int id_Persona) {
		Id_Persona = id_Persona;
	}

	public int getTipoEmpleado_Id_TipoEmpleado() {
		return TipoEmpleado_Id_TipoEmpleado;
	}

	public void setTipoEmpleado_Id_TipoEmpleado(int tipoEmpleado_Id_TipoEmpleado) {
		TipoEmpleado_Id_TipoEmpleado = tipoEmpleado_Id_TipoEmpleado;
	}

	public int getAlmacen_Id_Almacen() {
		return Almacen_Id_Almacen;
	}

	public void setAlmacen_Id_Almacen(int almacen_Id_Almacen) {
		Almacen_Id_Almacen = almacen_Id_Almacen;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
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
