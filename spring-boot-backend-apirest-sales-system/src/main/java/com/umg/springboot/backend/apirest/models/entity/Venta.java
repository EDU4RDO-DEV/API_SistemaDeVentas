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
	private int id_venta;
	
	private String cliente_codigo_cliente;
	private int empleado_codigo_empleado;
	private String numero_venta;
	private double monto;
	private char estado;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date fecha_venta;
	
	public int getId_venta() {
		return id_venta;
	}
	
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}

	public String getCliente_codigo_cliente() {
		return cliente_codigo_cliente;
	}

	public void setCliente_codigo_cliente(String cliente_codigo_cliente) {
		this.cliente_codigo_cliente = cliente_codigo_cliente;
	}

	public int getEmpleado_codigo_empleado() {
		return empleado_codigo_empleado;
	}

	public void setEmpleado_codigo_empleado(int empleado_codigo_empleado) {
		this.empleado_codigo_empleado = empleado_codigo_empleado;
	}

	public String getNumero_venta() {
		return numero_venta;
	}

	public void setNumero_venta(String numero_venta) {
		this.numero_venta = numero_venta;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
}
