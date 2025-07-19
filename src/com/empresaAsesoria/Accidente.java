package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Accidente {

	private int idAccidente;
	private String rutCliente;
	private LocalDate dia;
	private LocalDateTime hora;
	private String lugar;
	private String origen;
	private String consecuencia;
	/**
	 * 
	 */
	public Accidente() {
		super();
	}
	/**
	 * @param idAccidente
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param origen
	 * @param consecuencia
	 */
	public Accidente(int idAccidente, String rutCliente, LocalDate dia, LocalDateTime hora, String lugar, String origen,
			String consecuencia) {
		super();
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencia = consecuencia;
	}
	/**
	 * @return the idAccidente
	 */
	public int getIdAccidente() {
		return idAccidente;
	}
	/**
	 * @param idAccidente the idAccidente to set
	 */
	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
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
	public LocalDate getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	/**
	 * @return the hora
	 */
	public LocalDateTime getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
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
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	/**
	 * @return the consecuencia
	 */
	public String getConsecuencia() {
		return consecuencia;
	}
	/**
	 * @param consecuencia the consecuencia to set
	 */
	public void setConsecuencia(String consecuencia) {
		this.consecuencia = consecuencia;
	}
	
	
}
