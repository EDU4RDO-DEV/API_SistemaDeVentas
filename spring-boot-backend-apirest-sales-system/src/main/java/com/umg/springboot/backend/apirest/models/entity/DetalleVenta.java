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
	private int id_DetalleVenta;
	
	private int venta_Id_Venta;
	private long producto_Id_Proucto;
	private int cantidad;
	private double precio_Venta;
	
	public int getId_DetalleVenta() {
		return id_DetalleVenta;
	}

	public void setId_DetalleVenta(int id_DetalleVenta) {
		this.id_DetalleVenta = id_DetalleVenta;
	}

	public int getVenta_Id_Venta() {
		return venta_Id_Venta;
	}

	public void setVenta_Id_Venta(int venta_Id_Venta) {
		this.venta_Id_Venta = venta_Id_Venta;
	}

	public long getProducto_Id_Proucto() {
		return producto_Id_Proucto;
	}

	public void setProducto_Id_Proucto(long producto_Id_Proucto) {
		this.producto_Id_Proucto = producto_Id_Proucto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getPrecio_Venta() {
		return precio_Venta;
	}

	public void setPrecio_Venta(double precio_Venta) {
		this.precio_Venta = precio_Venta;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
