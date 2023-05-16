package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="venta")

public class Venta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Venta;
	
	private String cliente_Codigo_Cliente;
	private int empleado_Codigo_Empleado;
	private String numero_Venta;
	private double monto;
	private String estado;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date fecha_Venta;
	
	public int getId_Venta() {
		return id_Venta;
	}

	public void setId_Venta(int id_Venta) {
		this.id_Venta = id_Venta;
	}

	public String getCliente_Codigo_Cliente() {
		return cliente_Codigo_Cliente;
	}

	public void setCliente_Codigo_Cliente(String cliente_Codigo_Cliente) {
		this.cliente_Codigo_Cliente = cliente_Codigo_Cliente;
	}

	public int getEmpleado_Codigo_Empleado() {
		return empleado_Codigo_Empleado;
	}

	public void setEmpleado_Codigo_Empleado(int empleado_Codigo_Empleado) {
		this.empleado_Codigo_Empleado = empleado_Codigo_Empleado;
	}

	public String getNumero_Venta() {
		return numero_Venta;
	}

	public void setNumero_Venta(String numero_Venta) {
		this.numero_Venta = numero_Venta;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha_Venta() {
		return fecha_Venta;
	}

	public void setFecha_Venta(Date fecha_Venta) {
		this.fecha_Venta = fecha_Venta;
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
}
