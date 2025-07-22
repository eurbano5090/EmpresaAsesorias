package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

    private String nombres;
    private String apellidos;
    private long telefono;
    private String AFP;
    private int sistemaSalud;    // 1=Fonasa, 2=Isapre
    private String direccion;
    private String comuna;
    private int edad;            // 0 ≤ edad < 150

    private List<Accidente> accidentes   = new ArrayList<>();
    private List<VisitaEnTerreno> visitas = new ArrayList<>();

    public Cliente() { super(); }

    public Cliente(String nombre,
                   LocalDate fechaNacimiento,
                   String rut,
                   String nombres,
                   String apellidos,
                   long telefono,
                   String AFP,
                   int sistemaSalud,
                   String direccion,
                   String comuna,
                   int edad) {
        super(nombre, fechaNacimiento, rut);
        this.nombres      = nombres;
        this.apellidos    = apellidos;
        this.telefono     = telefono;
        this.AFP          = AFP;
        this.sistemaSalud = sistemaSalud;
        this.direccion    = direccion;
        this.comuna       = comuna;
        this.edad         = edad;
    }

    public String getNombres()    { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos()  { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public long getTelefono()      { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    public String getAFP()        { return AFP; }
    public void setAFP(String AFP) { this.AFP = AFP; }

    public int getSistemaSalud()  { return sistemaSalud; }
    public void setSistemaSalud(int sistemaSalud) {
        if (sistemaSalud != 1 && sistemaSalud != 2) {
            throw new IllegalArgumentException("Sistema de salud debe ser 1 o 2.");
        }
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion()  { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getComuna()     { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    public int getEdad()          { return edad; }
    public void setEdad(int edad) {
        if (edad < 0 || edad >= 150) {
            throw new IllegalArgumentException("Edad debe estar entre 0 y 149 años.");
        }
        this.edad = edad;
    }

    /** Retorna “Nombres Apellidos” */
    public String obtenerNombre() {
        return nombres + " " + apellidos;
    }

    /** Traduce el código a texto del sistema de salud */
    public String obtenerSistemaSalud() {
        return sistemaSalud == 1 ? "Fonasa" : "Isapre";
    }

    /** Despliega datos de Usuario y agrega dirección y comuna */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Dirección: " + direccion + " | Comuna: " + comuna);
    }

    public void agregarAccidente(Accidente acc) {
        if (getRut().equals(acc.getRutCliente())) accidentes.add(acc);
    }

    public void agregarVisita(VisitaEnTerreno v) {
        if (getRut().equals(v.getRutCliente())) visitas.add(v);
    }

    @Override
    public String toString() {
        String fn = getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return String.format(
            "Cliente[nombre=%s, FN=%s, RUN=%s, completo=%s, tel=%d, AFP=%s, salud=%s, dir=%s, comuna=%s, edad=%d]",
            getNombre(), fn, getRut(), obtenerNombre(), telefono, AFP,
            obtenerSistemaSalud(), direccion, comuna, edad
        );
    }
}