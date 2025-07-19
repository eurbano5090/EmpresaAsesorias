package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VisitaEnTerreno {
  
	private int idVisita;
    private String rutCliente;
    private LocalDate dia;
    private LocalDateTime hora;
    private String lugar;
    private String comentarios;
	/**
	 * 
	 */
	public VisitaEnTerreno() {
		super();
	}
	/**
	 * @param idVisita
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param comentarios
	 */
	public VisitaEnTerreno(int idVisita, String rutCliente, LocalDate dia, LocalDateTime hora, String lugar,
			String comentarios) {
		super();
		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}
	/**
	 * @return the idVisita
	 */
	public int getIdVisita() {
		return idVisita;
	}
	/**
	 * @param idVisita the idVisita to set
	 */
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
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
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}
	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
    
    
}
