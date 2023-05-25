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
@Table(name="tb_devolucion")

public class Devolucion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_Devolucion;
	
	@Column(name="detalle_venta_id_detalle_venta")
	private int detalle_venta_id_detalle_venta;
	@Column(name="detalle_venta_id_producto")
	private long detalle_venta_id_producto;
	private String Motivo;
	private int Cantidad;
	
	@Column(name="Fecha_devolucion")
	@Temporal(TemporalType.DATE)
	private Date Fecha_devolucion;

	@PrePersist
	public void prePersist() {
		Fecha_devolucion = new Date();
	}
	
	public int getId_Devolucion() {
		return Id_Devolucion;
	}

	public void setId_Devolucion(int id_Devolucion) {
		Id_Devolucion = id_Devolucion;
	}

	public int getDetalle_venta_id_detalle_venta() {
		return detalle_venta_id_detalle_venta;
	}
	
	public void setDetalle_venta_id_detalle_venta(int detalle_venta_id_detalle_venta) {
		this.detalle_venta_id_detalle_venta = detalle_venta_id_detalle_venta;
	}

	public long getDetalle_venta_id_producto() {
		return detalle_venta_id_producto;
	}

	public void setDetalle_venta_id_producto(long detalle_venta_id_producto) {
		this.detalle_venta_id_producto = detalle_venta_id_producto;
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
