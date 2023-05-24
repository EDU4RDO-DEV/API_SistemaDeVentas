package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Persona;
	
	private String Codigo_Cliente;
	private int tipo_cliente_id_tipo_cliente;
	private char Estado;
	
	public int getId_Persona() {
		return Id_Persona;
	}

	public void setId_Persona(int id_Persona) {
		Id_Persona = id_Persona;
	}
	
	public String getCodigo_Cliente() {
		return Codigo_Cliente;
	}

	public void setCodigo_Cliente(String codigo_Cliente) {
		Codigo_Cliente = codigo_Cliente;
	}
	
	

	public char getEstado() {
		return Estado;
	}

	public void setEstado(char estado) {
		Estado = estado;
	}

	

	public void setTipo_cliente_id_tipo_cliente(int tipo_cliente_id_tipo_cliente) {
		this.tipo_cliente_id_tipo_cliente = tipo_cliente_id_tipo_cliente;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getTipo_cliente_id_tipo_cliente() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
