package com.empresaAsesoria;

import java.util.ArrayList;

public class Administrador extends Usuario{
	
	private String area;
	private String exprerienciaPrevia;
	
	@Override
	public String toString() {
		return "Administrativo []";
	}

	/**
	 * @param area
	 * @param exprerienciaPrevia
	 */
	public Administrador(String area, String exprerienciaPrevia) {
		super();
		this.area = area;
		this.exprerienciaPrevia = exprerienciaPrevia;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the exprerienciaPrevia
	 */
	public String getExprerienciaPrevia() {
		return exprerienciaPrevia;
	}

	/**
	 * @param exprerienciaPrevia the exprerienciaPrevia to set
	 */
	public void setExprerienciaPrevia(String exprerienciaPrevia) {
		this.exprerienciaPrevia = exprerienciaPrevia;
	}
	
	/*** cargar lista con capacitaciones pre*/
	ArrayList<Administrador>administradores= new ArrayList<>();//inventado 4 

}
