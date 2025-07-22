package com.empresaAsesoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Administrador extends Usuario {
	
	static Scanner scan= new Scanner (System.in);
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
	public Administrador(String nombre, LocalDate fechaNacimiento, String rut,String area, String exprerienciaPrevia) {
		super(nombre,fechaNacimiento,rut);
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
	

    @Override
    public void analizarUsuario() {
        super.analizarUsuario(); 
        System.out.println("Área: " + area);
        System.out.println("Años de experiencia: " + getExprerienciaPrevia());
    }

    public static void crearAdministrador(String nombre, LocalDate fechaNacimiento, String rut) {
        System.out.print("Área: ");
        String area = scan.nextLine().trim();

        System.out.print("Experiencia previa: ");
        String experiencia = scan.nextLine().trim();

        Administrador admin = new Administrador(nombre, fechaNacimiento, rut, area, experiencia);
        usuarios.add(admin);
        System.out.println("✅ Administrativo registrado");
	
}
}
