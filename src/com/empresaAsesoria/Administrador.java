package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Administrador extends Usuario {

    private String area;
    private String experienciaPrevia;

    // Constructor sin parámetros
    public Administrador() {
        super();
    }

    // Constructor con todos los atributos (incluye supercampos)
    public Administrador(
        String nombre,
        LocalDate fechaNacimiento,
        String rut,
        String area,
        String experienciaPrevia
    ) {
        super(nombre, fechaNacimiento, rut);
        setArea(area);
        setExperienciaPrevia(experienciaPrevia);
    }

    public String getArea() {
        return area;
    }

    /**
     * Área obligatorio, 5–20 caracteres.
     */
    public void setArea(String area) {
        if (area == null || area.length() < 5 || area.length() > 20) {
            throw new IllegalArgumentException(
                "El área debe tener entre 5 y 20 caracteres."
            );
        }
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    /**
     * Experiencia previa, máximo 100 caracteres.
     */
    public void setExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia == null) {
            this.experienciaPrevia = "";
        } else if (experienciaPrevia.length() > 100) {
            throw new IllegalArgumentException(
                "La experiencia previa no puede exceder los 100 caracteres."
            );
        } else {
            this.experienciaPrevia = experienciaPrevia;
        }
    }

    /**
     * Implementación de AsesoriaInterface.
     * Muestra datos base de Usuario, luego área y experiencia.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(
            "Área: " + area +
            " | Experiencia: " + experienciaPrevia
        );
    }

    /**
     * toString formateado:
     * Usuario[nombre=…, FN=dd/MM/yyyy, RUN=…] +
     * ", Área: …, Experiencia: …"
     */
    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fn = getFechaNacimiento() != null
            ? getFechaNacimiento().format(fmt)
            : "sin fecha";
        return String.format(
            "Administrador[nombre=%s, FN=%s, RUN=%s, área=%s, experiencia=%s]",
            getNombre(), fn, getRut(),
            area, experienciaPrevia
        );
    }
}
