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
	 * @param nombreRevision the nombreRevision to set
	 */
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	/**
	 * @return the detalleRevisar
	 */
	public String getDetalleRevisar() {
		return detalleRevisar;
	}
	/**
	 * @param detalleRevisar the detalleRevisar to set
	 */
	public void setDetalleRevisar(String detalleRevisar) {
		this.detalleRevisar = detalleRevisar;
	}
	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
	


