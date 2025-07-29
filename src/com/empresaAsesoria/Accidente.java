package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
	 * 
	 * @param lugar the lugar del accidente to set
	 * Entre 10 y 50 caracteres.
	 *  @throws IllegalArgumentException si el texto es nulo o fuera del rango permitido
	 */
	public void setLugar(String lugar) {
		if (lugar != null && lugar.length() >= 10 && lugar.length() <= 50) {
			this.lugar = lugar;
		} else {
			throw new IllegalArgumentException("El lugar debe tener entre 10 y 50 caracteres.");
		}
	}
	
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * @param origen the origen del accidente to set
	 * Máximo 100 caracteres.
	 * @throws IllegalArgumentException si el texto es nulo o excede el máximo
	 */
	public void setOrigen(String origen) {
		if (origen != null && origen.length() <= 100) {
			this.origen = origen;
		} else {
			throw new IllegalArgumentException("El origen no puede exceder los 100 caracteres.");
		}
	}
	/**
	 * @return the consecuencia
	 */
	public String getConsecuencia() {
		return consecuencia;
	}
	/**
	 * @param consecuencia the consecuencia del accidente to set
	 * Máximo 100 caracteres.
	 *  @throws IllegalArgumentException si el texto es nulo o excede el máximo
	 */
	public void setConsecuencia(String consecuencia) {
		if (consecuencia != null && consecuencia.length() <= 100) {
			this.consecuencia = consecuencia;
		} else {
			throw new IllegalArgumentException("Las consecuencias no pueden exceder los 100 caracteres.");
		}
	}
	
	//Método para mostrar el registro de un accidente
	@Override
	public String toString() {
		DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
		return "----- Datos del Accidente -----\n" + "ID Accidente: " + idAccidente + "\n" + 
				"RUT Cliente: " + rutCliente + "\n" + 
				"Día: " + dia.format(formatterFecha) + "\n" + 
				"Hora: " + hora.format(formatterHora) + "\n" + 
				"Lugar: " + lugar + "\n" + 
				"Origen: " + origen + "\n" + 
				"Consecuencias: " + consecuencia + "\n";
	}
	public static List<Accidente> listaAccidentes = new ArrayList<>();
	
	}

