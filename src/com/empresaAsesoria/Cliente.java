package com.empresaAsesoria;

import java.util.ArrayList;

public class Cliente extends Usuario {
	
	private String nombres;
	private String apellidos;
	private int telefono;
	private String AFP;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private String edad;
	/**
	 * @param nombres
	 * @param apellidos
	 * @param telefono
	 * @param aFP
	 * @param sistemaSalud
	 * @param direccion
	 * @param comuna
	 * @param edad
	 */
	public Cliente(String nombres, String apellidos, int telefono, String aFP, int sistemaSalud, String direccion,
			String comuna, String edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		AFP = aFP;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the aFP
	 */
	public String getAFP() {
		return AFP;
	}
	/**
	 * @param aFP the aFP to set
	 */
	public void setAFP(String aFP) {
		AFP = aFP;
	}
	/**
	 * @return the sistemaSalud
	 */
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}
	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	/*** cargar lista con clientes (trabajadores ) pre*/
	ArrayList<Cliente>clientes= new ArrayList<>();//inventado 40
	
	private static void obtenerNombre() {
	}
	private static void obtenerSistemaSalud() {	
	}
	
	
}
