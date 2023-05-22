package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_tipocliente")
public class TipoCliente implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Tipocliente;
	
	private char Tipo_cliente;
	private double Descuento;
	
	public int getId_Tipocliente() {
		return Id_Tipocliente;
	}

	public void setId_Tipocliente(int id_Tipocliente) {
		Id_Tipocliente = id_Tipocliente;
	}

	public char getTipo_cliente() {
		return Tipo_cliente;
	}

	public void setTipo_cliente(char tipo_cliente) {
		Tipo_cliente = tipo_cliente;
	}

	public double getDescuento() {
		return Descuento;
	}

	public void setDescuento(double descuento) {
		Descuento = descuento;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
