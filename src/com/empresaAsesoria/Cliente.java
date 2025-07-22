package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Cliente extends Usuario {
	static Scanner scan= new Scanner (System.in);
	
	private String apellidos;
	private int telefono;
	private String AFP;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
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
	public Cliente(String nombre, LocalDate fechaNacimiento, String rut, String apellidos, int telefono, String aFP, int sistemaSalud, String direccion,
			String comuna, int edad) {
		super(nombre,fechaNacimiento,rut);
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
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*** cargar lista con clientes (trabajadores ) pre*/
	
	public static void crearCliente(String nombre, LocalDate fechaNacimiento, String rut) {
	    System.out.print("Apellidos: ");
	    String apellidos = scan.nextLine().trim();

	    System.out.print("Teléfono: ");
	    int telefono = Integer.parseInt(scan.nextLine().trim());

	    System.out.print("AFP: ");
	    String afp = scan.nextLine().trim();

	    System.out.print("Sistema salud (1: Fonasa, 2: Isapre): ");
	    int sistemaSalud = Integer.parseInt(scan.nextLine().trim());

	    System.out.print("Dirección: ");
	    String direccion = scan.nextLine().trim();

	    System.out.print("Comuna: ");
	    String comuna = scan.nextLine().trim();

	    System.out.print("Edad: ");
	    int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();

	    Cliente cliente = new Cliente(nombre, fechaNacimiento, rut, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad);
	    usuarios.add(cliente);
	    System.out.println("✅ Cliente registrado");
	    
	}
	
	private static void obtenerNombre() {
	}
	private static void obtenerSistemaSalud() {	
	}
	
	
}
