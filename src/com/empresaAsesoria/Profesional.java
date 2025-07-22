package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Profesional extends Usuario {

   static Scanner scan= new Scanner (System.in);
	private String titulo;
	private LocalDate fechaIngreso;
	/**
	 * 
	 */
	public Profesional() {
		super();
	}
	/**
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String nombre, LocalDate fechaNacimiento, String rut,String titulo, LocalDate fechaIngreso) {
		super(nombre,fechaNacimiento,rut);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the fechaIngreso
	 */
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	 @Override
	    public void analizarUsuario() {
	        super.analizarUsuario(); 
	        System.out.println("Título: " + titulo);
	        System.out.println("Fecha de ingreso: " + fechaIngreso);
	    }
	 
	    public static void crearProfesional( String nombre, LocalDate fechaNacimiento, String rut) {
		    System.out.print("Título: ");
		    String titulo = scan.nextLine().trim();

		    System.out.print("Fecha ingreso (dd-MM-yyyy): ");
		    LocalDate fechaIngreso = LocalDate.parse(scan.nextLine().trim(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

		    Profesional prof = new Profesional(nombre, fechaNacimiento, rut, titulo, fechaIngreso);
		    usuarios.add(prof);
		    System.out.println("✅ Profesional registrado");
		}
}
