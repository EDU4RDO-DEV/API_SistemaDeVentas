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
@Table(name="devolucion")

public class Devolucion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Devolucion;
	
	private int detalleVenta_IdDetalleVenta;
	private int detalleVenta_IdProducto;
	private String motivo;
	private int cantidad;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date fecha_Devolucion;

	public int getId_Devolucion() {
		return id_Devolucion;
	}

	public void setId_Devolucion(int id_Devolucion) {
		this.id_Devolucion = id_Devolucion;
	}

	public int getDetalleVenta_IdDetalleVenta() {
		return detalleVenta_IdDetalleVenta;
	}

	public void setDetalleVenta_IdDetalleVenta(int detalleVenta_IdDetalleVenta) {
		this.detalleVenta_IdDetalleVenta = detalleVenta_IdDetalleVenta;
	}

	public int getDetalleVenta_IdProducto() {
		return detalleVenta_IdProducto;
	}

	public void setDetalleVenta_IdProducto(int detalleVenta_IdProducto) {
		this.detalleVenta_IdProducto = detalleVenta_IdProducto;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha_Devolucion() {
		return fecha_Devolucion;
	}

	public void setFecha_Venta(Date fecha_Devolucion) {
		this.fecha_Devolucion = fecha_Devolucion;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
