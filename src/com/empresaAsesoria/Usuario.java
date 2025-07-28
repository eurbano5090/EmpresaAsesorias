package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Usuario implements AsesoriaInterface {

	private String nombre;
	private LocalDate fechaNacimiento;
	private String rut;
	static ArrayList<Usuario> usuarios = new ArrayList<>();

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
	
	/**
	 * @return the usuarios
	 */
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		Usuario.usuarios = usuarios;
	}
	

	public static void crearUsuario(Scanner scan) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("\n--- Registrar Nuevo Usuario ---");
        System.out.print("Ingrese nombre preferido por Usuario y primer apellido: ");
        String nombre = scan.nextLine().trim();

        System.out.print("Ingrese Fecha de Nacimiento (dd-MM-yyyy): ");
        LocalDate fn = LocalDate.parse(scan.nextLine().trim(), fmt);

        System.out.print("Ingrese Rut del Usuario con puntos, guión y DV: ");
        String rut = scan.nextLine().trim();

       	System.out.print("Seleccione el Tipo de Usuario (1: Cliente, 2: Profesional, 3: Administrativo): ");
	    int tipo = Integer.parseInt(scan.nextLine().trim());
		 switch (tipo) {
	        case 1 -> Cliente.crearCliente(nombre, fn, rut);
	        case 2 -> Profesional.crearProfesional(nombre, fn, rut);
	        case 3 -> Administrador.crearAdministrador(nombre, fn, rut);
	        default -> System.out.println("❌ Tipo inválido");
	    }

		System.out.println("✅ 	Usuario registrado exitosamente con RUT " + rut);
		
	}



	@Override
	public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUT: " + rut);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }

	public String mostrarEdad() {
		int edad = Period.between(fechaNacimiento,LocalDate.now()).getYears();
		return " El Usuario tiene " + edad + " años";
	 }	
	}
		

