package com.example.demo;
/*
 * Clase de Alumnos, definimos lo que tiene que tener cada alumno
 * @author Jmenabc
 */
public class Alumno {

	//Atributos
	private int id;
	private String nombre;
	private String apellido;
	
	//Constructor
	public Alumno(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Alumno() {}
	
	//Getters y Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//toString

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
	
}
