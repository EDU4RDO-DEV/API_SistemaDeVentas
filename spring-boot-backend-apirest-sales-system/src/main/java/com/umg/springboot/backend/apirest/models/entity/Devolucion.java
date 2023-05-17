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
	private int id_devolucion;
	
	private int detalleVenta_idDetalleVenta;
	private long detalleVenta_idProducto;
	private String motivo;
	private int cantidad;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date fecha_devolucion;

	public int getId_devolucion() {
		return id_devolucion;
	}

	public void setId_devolucion(int id_devolucion) {
		this.id_devolucion = id_devolucion;
	}

	public int getDetalleVenta_idDetalleVenta() {
		return detalleVenta_idDetalleVenta;
	}

	public void setDetalleVenta_idDetalleVenta(int detalleVenta_idDetalleVenta) {
		this.detalleVenta_idDetalleVenta = detalleVenta_idDetalleVenta;
	}

	public long getDetalleVenta_idProducto() {
		return detalleVenta_idProducto;
	}

	public void setDetalleVenta_idProducto(long detalleVenta_idProducto) {
		this.detalleVenta_idProducto = detalleVenta_idProducto;
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

	public Date getFecha_devolucion() {
		return fecha_devolucion;
	}

	public void setFecha_devolucion(Date fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
