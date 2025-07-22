package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Profesional extends Usuario {

    private String titulo;
    private LocalDate fechaIngreso;

    // Constructor sin parámetros
    public Profesional() {
        super();
    }

    // Constructor con todos los atributos (incluye campos de Usuario)
    public Profesional(
        String nombre,
        LocalDate fechaNacimiento,
        String rut,
        String titulo,
        LocalDate fechaIngreso
    ) {
        super(nombre, fechaNacimiento, rut);
        setTitulo(titulo);
        setFechaIngreso(fechaIngreso);
    }

    public String getTitulo() {
        return titulo;
    }

    /**
     * Título obligatorio, 10–50 caracteres.
     */
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.length() < 10 || titulo.length() > 50) {
            throw new IllegalArgumentException(
                "El título debe tener entre 10 y 50 caracteres."
            );
        }
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Fecha de ingreso obligatoria.
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        if (fechaIngreso == null) {
            throw new IllegalArgumentException("La fecha de ingreso es obligatoria.");
        }
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Implementación de AsesoriaInterface:
     * muestra nombre y RUN (método padre), luego título y fecha de ingreso.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        String fi = fechaIngreso.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Título: " + titulo + " | Fecha de ingreso: " + fi);
    }

    /**
     * toString formateado:
     * Profesional[nombre=…, FN=dd/MM/yyyy, RUN=…, título=…, ingreso=dd/MM/yyyy]
     */
    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fn = getFechaNacimiento().format(fmt);
        String fi = fechaIngreso.format(fmt);
        return String.format(
            "Profesional[nombre=%s, FN=%s, RUN=%s, título=%s, ingreso=%s]",
            getNombre(), fn, getRut(), titulo, fi
        );
    }
}