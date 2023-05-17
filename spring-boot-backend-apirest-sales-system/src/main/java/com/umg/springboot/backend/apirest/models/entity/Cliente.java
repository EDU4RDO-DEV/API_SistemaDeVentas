package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Persona;
	
	private String codigo_Cliente;
	private int tipoCliente_Id_TipoCliente;
	private String estado;
	
	public int getId_Persona() {
		return id_Persona;
	}
	
	public void setId_Persona(int id_Persona) {
		this.id_Persona = id_Persona;
	}
	
	public String getCodigo_Cliente() {
		return codigo_Cliente;
	}
	
	public void setCodigo_Cliente(String codigo_Cliente) {
		this.codigo_Cliente = codigo_Cliente;
	}
	
	public int getTipoCliente_Id_TipoCliente() {
		return tipoCliente_Id_TipoCliente;
	}
	public void setTipoCliente_Id_TipoCliente(int tipoCliente_Id_TipoCliente) {
		this.tipoCliente_Id_TipoCliente = tipoCliente_Id_TipoCliente;
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
