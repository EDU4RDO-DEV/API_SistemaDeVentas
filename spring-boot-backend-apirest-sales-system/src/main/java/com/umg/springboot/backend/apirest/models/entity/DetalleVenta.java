package com.umg.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_detalleventa")
public class DetalleVenta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id_DetalleVenta;
	
	private int Venta_Id_venta;
	private long Producto_Id_Producto;
	private int Cantidad;
	private double Precio_venta;
	
	public int getId_DetalleVenta() {
		return Id_DetalleVenta;
	}

	public void setId_DetalleVenta(int id_DetalleVenta) {
		Id_DetalleVenta = id_DetalleVenta;
	}

	public int getVenta_Id_venta() {
		return Venta_Id_venta;
	}

	public void setVenta_Id_venta(int venta_Id_venta) {
		Venta_Id_venta = venta_Id_venta;
	}

	public long getProducto_Id_Producto() {
		return Producto_Id_Producto;
	}

	public void setProducto_Id_Producto(long producto_Id_Producto) {
		Producto_Id_Producto = producto_Id_Producto;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public double getPrecio_venta() {
		return Precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		Precio_venta = precio_venta;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
