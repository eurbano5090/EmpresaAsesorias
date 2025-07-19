package com.empresaAsesoria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Profesional extends Usuario {

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
	public Profesional(String titulo, LocalDate fechaIngreso) {
		super();
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
	
	/*** cargar lista con profesionales pre*/
	ArrayList<Profesional>profesionales= new ArrayList<>();//inventado 4
}
