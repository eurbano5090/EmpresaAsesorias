package com.empresaAsesoria;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Capacitacion {
	
	private int idCapacitacion;
	private String rutCliente;
	private String dia;
	private LocalDateTime horaCapacitacion;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;
	/**
	 * 
	 */
	public Capacitacion() {
		super();
	}
	/**
	 * @param idCapacitacion
	 * @param rutCliente
	 * @param dia
	 * @param horaCapacitacion
	 * @param lugar
	 * @param duracion
	 * @param cantidadAsistentes
	 */
	public Capacitacion(int idCapacitacion, String rutCliente, String dia, LocalDateTime horaCapacitacion, String lugar,
			String duracion, int cantidadAsistentes) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.horaCapacitacion = horaCapacitacion;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	/**
	 * @return the idCapacitacion
	 */
	public int getIdCapacitacion() {
		return idCapacitacion;
	}
	/**
	 * @param idCapacitacion the idCapacitacion to set
	 */
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}
	/**
	 * @return the rutCliente
	 */
	public String getRutCliente() {
		return rutCliente;
	}
	/**
	 * @param rutCliente the rutCliente to set
	 */
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	/**
	 * @return the horaCapacitacion
	 */
	public LocalDateTime getHoraCapacitacion() {
		return horaCapacitacion;
	}
	/**
	 * @param horaCapacitacion the horaCapacitacion to set
	 */
	public void setHoraCapacitacion(LocalDateTime horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}
	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the cantidadAsistentes
	 */
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	/**
	 * @param cantidadAsistentes the cantidadAsistentes to set
	 */
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	/*** cargar lista con capacitaciones pre*/
	ArrayList<Capacitacion>capacitaciones= new ArrayList<>();//inventado 20
	
	public static void crearCapacitacion() {}
	
	public static void mostrarDetalle() {}

}
