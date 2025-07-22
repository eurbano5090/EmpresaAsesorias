package com.empresaAsesoria;

public class Revision {
	
	private int idRevision;
	private int idVisita;
	private String nombreRevision;
	private String detalleRevisar;
	private int estado;
	/**
	 * 
	 */
	public Revision() {
		super();
	}
	/**
	 * @param idRevision
	 * @param idVisita
	 * @param nombreRevision
	 * @param detalleRevisar
	 * @param estado
	 */
	public Revision(int idRevision, int idVisita, String nombreRevision, String detalleRevisar, int estado) {
		super();
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevisar = detalleRevisar;
		this.estado = estado;
	}
	/**
	 * @return the idRevision
	 */
	public int getIdRevision() {
		return idRevision;
	}
	/**
	 * @param idRevision the idRevision to set
	 */
	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
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
	 * @return the nombreRevision
	 */
	public String getNombreRevision() {
		return nombreRevision;
	}
	
	/**
	 * @return the detalleRevisar
	 */
	public String getDetalleRevisar() {
		return detalleRevisar;
	}
	
	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}
	
	/**
	 * Establece el nombre de la revisión (entre 10 y 50 caracteres).
	 *
	 * @param nombreRevision 
	 * @throws IllegalArgumentException si el nombre es nulo o su longitud no está en el rango permitido
	 */
	public void setNombreRevision(String nombreRevision) {
		if (nombreRevision != null && nombreRevision.length() >= 10 && nombreRevision.length() <= 50) {
			this.nombreRevision = nombreRevision;
		} else {
			throw new IllegalArgumentException("El nombre de la revisión debe tener entre 10 y 50 caracteres.");
		}
	}

	/**
	 * Establece el detalle a revisar (texto máx. 100 caracteres).
	 *
	 * @param detalleRevisar
	 * @throws IllegalArgumentException si el detalle es nulo o supera los 100 caracteres
	 */
	public void setDetalleRevisar(String detalleRevisar) {
		if (detalleRevisar != null && detalleRevisar.length() <= 100) {
			this.detalleRevisar = detalleRevisar;
		} else {
			throw new IllegalArgumentException("El detalle a revisar no puede exceder los 100 caracteres.");
		}
	}

	/**
	 * @param estado the estado to set
	 */
	
	public void setEstado(int estado) {
	    if (estado >= 1 && estado <= 3) {
	        this.estado = estado;
	    } else {
	        throw new IllegalArgumentException("Estado inválido. Debe ser 1 (sin problemas), 2 (con observaciones) o 3 (no aprueba)");
	    }
	}

	//Método para validar y mostrar el esdo de la revisión
	@Override
	public String toString() {
		String estadoTexto = "";

		switch (estado) {
		case 1:
			estadoTexto = "Sin problemas";
			break;
		case 2:
			estadoTexto = "Con observaciones";
			break;
		case 3:
			estadoTexto = "No aprueba";
			break;
		default:
			estadoTexto = "Desconocido";
			break;
		}

	    return "----- Detalle de la Revisión -----\n" +
        "ID Revisión: " + idRevision + "\n" +
        "ID Visita Asociada: " + idVisita + "\n" +
        "Nombre de la Revisión: " + nombreRevision + "\n" +
        "Detalle a Revisar: " + detalleRevisar + "\n" +
        "Estado: " + estadoTexto + "\n";
	}


}


