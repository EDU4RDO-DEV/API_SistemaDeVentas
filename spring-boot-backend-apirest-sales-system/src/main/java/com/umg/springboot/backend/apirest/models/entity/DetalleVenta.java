package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detalleVenta")
public class DetalleVenta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_detalleVenta;
	
	private int venta_id_venta;
	private long producto_id_producto;
	private int cantidad;
	private double precio_venta;
	
	public int getId_detalleVenta() {
		return id_detalleVenta;
	}

	public void setId_detalleVenta(int id_detalleVenta) {
		this.id_detalleVenta = id_detalleVenta;
	}

	public int getVenta_id_venta() {
		return venta_id_venta;
	}

	public void setVenta_id_venta(int venta_id_venta) {
		this.venta_id_venta = venta_id_venta;
	}

	public long getProducto_id_producto() {
		return producto_id_producto;
	}

	public void setProducto_id_producto(long producto_id_producto) {
		this.producto_id_producto = producto_id_producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
