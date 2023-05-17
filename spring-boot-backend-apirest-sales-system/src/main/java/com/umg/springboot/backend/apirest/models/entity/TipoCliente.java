package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoCliente")
public class TipoCliente implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tipoCliente;
	
	private String tipo_cliente;
	private double descuento;
	
	public int getId_tipoCliente() {
		return id_tipoCliente;
	}

	public void setId_tipoCliente(int id_tipoCliente) {
		this.id_tipoCliente = id_tipoCliente;
	}

	public String getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(String tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
