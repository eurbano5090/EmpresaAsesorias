package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario implements AsesoriaInterface {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String rut;

    public Usuario() { }

    public Usuario(String nombre, LocalDate fechaNacimiento, String rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // validación: obligatorio, 10–50 chars
        if (nombre == null || nombre.length() < 10 || nombre.length() > 50) {
            throw new IllegalArgumentException("Nombre debe tener entre 10 y 50 caracteres.");
        }
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria.");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        // validar formato y valor < 100_000_000
        if (rut == null) {
            throw new IllegalArgumentException("RUN no puede ser nulo.");
        }
        long num = Long.parseLong(rut.replace(".", "").replace("-", ""));
        if (num < 0 || num >= 100_000_000L) {
            throw new IllegalArgumentException("RUN debe ser menor a 99.999.999.");
        }
        this.rut = rut;
    }

    /**
     * Calcula edad y devuelve mensaje:
     * "El usuario tiene X años"
     */
    public String mostrarEdad() {
        int años = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        return "El usuario tiene " + años + " años";
    }

    /**
     * Implementación de la interfaz:
     * despliega nombre y RUN.
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre + " | RUN: " + rut);
    }

    @Override
    public String toString() {
        String fn = fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return String.format("Usuario[nombre=%s, FN=%s, RUN=%s]", nombre, fn, rut);
    }
}