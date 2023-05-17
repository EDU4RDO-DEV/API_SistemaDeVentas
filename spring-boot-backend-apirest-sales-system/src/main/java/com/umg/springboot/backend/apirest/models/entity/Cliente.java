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
	private int id_persona;
	
	private String codigo_cliente;
	private int tipoCliente_id_tipoCliente;
	private char estado;
	
	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(String codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public int getTipoCliente_id_tipoCliente() {
		return tipoCliente_id_tipoCliente;
	}

	public void setTipoCliente_id_tipoCliente(int tipoCliente_id_tipoCliente) {
		this.tipoCliente_id_tipoCliente = tipoCliente_id_tipoCliente;
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
