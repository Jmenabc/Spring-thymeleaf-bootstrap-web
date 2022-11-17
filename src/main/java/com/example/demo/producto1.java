package com.example.demo;

//Entidad producto 1

public class producto1 {

	private String nombre;
	private int precio;

	public producto1(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public producto1() {
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
