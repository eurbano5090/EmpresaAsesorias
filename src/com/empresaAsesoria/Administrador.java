package com.empresaAsesoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Administrador extends Usuario {
	
	static Scanner scan= new Scanner (System.in);
	private String area;
	private String experienciaPrevia;
	
	
	/**
	 * @param area
	 * @param experienciaPrevia
	 */
	public Administrador(String nombre, LocalDate fechaNacimiento, String rut,String area, String experienciaPrevia) {
		super(nombre,fechaNacimiento,rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
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
	 * @return the experienciaPrevia
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	/**
	 * @param experienciaPrevia the experienciaPrevia to set
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	

    @Override
    public void analizarUsuario() {
        super.analizarUsuario(); 
        System.out.println("Área: " + area);
        System.out.println("Años de Experiencia: " + getExperienciaPrevia());
    }

    public static void crearAdministrador(String nombre, LocalDate fechaNacimiento, String rut) {
        System.out.print("Área: ");
        String area = scan.nextLine().trim();

        System.out.print("Experiencia previa: ");
        String experiencia = scan.nextLine().trim();

        Administrador admin = new Administrador(nombre, fechaNacimiento, rut, area, experiencia);
        usuarios.add(admin);
        	
}
 
    @Override
	 public String toString() {
       return String.format(
           "Administrador Nombre=%s, RUT=%s, %s, Área=%s, Experiencia=%s",
           getNombre(), getRut(),
           mostrarEdad(),
           area,
           experienciaPrevia
       );
   }
   
  
}
