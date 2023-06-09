package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tb_venta")
public class Venta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Venta;
	
	private int Cliente_Codigo_Cliente;
	private int Empleado_Codigo_Empleado;
	private String Numero_venta;
	private double Monto;
	private char Estado;
	
	@Column(name="Fecha_venta")
	@Temporal(TemporalType.DATE)
	private Date Fecha_venta;
	
	@PrePersist
	public void prePersist() {
		Fecha_venta = new Date();
	}
	
	public int getId_Venta() {
		return Id_Venta;
	}

	public void setId_Venta(int id_Venta) {
		Id_Venta = id_Venta;
	}

	public int getCliente_Codigo_Cliente() {
		return Cliente_Codigo_Cliente;
	}

	public void setCliente_Codigo_Cliente(int cliente_Codigo_Cliente) {
		Cliente_Codigo_Cliente = cliente_Codigo_Cliente;
	}

	public int getEmpleado_Codigo_Empleado() {
		return Empleado_Codigo_Empleado;
	}

	public void setEmpleado_Codigo_Empleado(int empleado_Codigo_Empleado) {
		Empleado_Codigo_Empleado = empleado_Codigo_Empleado;
	}

	public String getNumero_venta() {
		return Numero_venta;
	}

	public void setNumero_venta(String numero_venta) {
		Numero_venta = numero_venta;
	}

	public double getMonto() {
		return Monto;
	}

	public void setMonto(double monto) {
		Monto = monto;
	}

	public char getEstado() {
		return Estado;
	}

	public void setEstado(char estado) {
		Estado = estado;
	}

	public Date getFecha_venta() {
		return Fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		Fecha_venta = fecha_venta;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
