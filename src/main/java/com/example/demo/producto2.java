package com.example.demo;

//Entidad producto 2
public class producto2 {
	private String nombre;
	private int precio;

	public producto2(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public producto2() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
