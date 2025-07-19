package com.empresaAsesoria;

import java.time.LocalDate;

public class Usuario {

	private String nombre;
	private LocalDate fechaNacimiento;
	private String rut;
	
	
	
	/**
	 * 
	 */
	public Usuario() {
		super();
	}
	
	
	/**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param rut
	 */
	public Usuario(String nombre, LocalDate fechaNacimiento, String rut) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public static void mostrarEdad() {};
	public static void analizarUsuario() {};
	
}
