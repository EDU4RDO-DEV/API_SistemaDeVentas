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
@Table(name="tb_devolucion")

public class Devolucion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Devolucion;
	
	private int DetalleVenta_IdDetalleVenta;
	private long DetalleVenta_IdProducto;
	private String Motivo;
	private int Cantidad;
	
	@Column(name="Fecha_devolucion")
	@Temporal(TemporalType.DATE)
	private Date Fecha_devolucion;

	public int getId_Devolucion() {
		return Id_Devolucion;
	}

	public void setId_Devolucion(int id_Devolucion) {
		Id_Devolucion = id_Devolucion;
	}

	public int getDetalleVenta_IdDetalleVenta() {
		return DetalleVenta_IdDetalleVenta;
	}

	public void setDetalleVenta_IdDetalleVenta(int detalleVenta_IdDetalleVenta) {
		DetalleVenta_IdDetalleVenta = detalleVenta_IdDetalleVenta;
	}

	public long getDetalleVenta_IdProducto() {
		return DetalleVenta_IdProducto;
	}

	public void setDetalleVenta_IdProducto(long detalleVenta_IdProducto) {
		DetalleVenta_IdProducto = detalleVenta_IdProducto;
	}

	public String getMotivo() {
		return Motivo;
	}

	public void setMotivo(String motivo) {
		Motivo = motivo;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public Date getFecha_devolucion() {
		return Fecha_devolucion;
	}

	public void setFecha_devolucion(Date fecha_devolucion) {
		Fecha_devolucion = fecha_devolucion;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
