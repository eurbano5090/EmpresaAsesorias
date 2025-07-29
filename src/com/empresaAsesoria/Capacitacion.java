package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Representa una capacitación programada para un cliente.
 * Mantiene una lista estática de todas las capacitaciones registradas,
 * y un método fábrica para crearlas desde consola.
 */
public class Capacitacion {

    // Lista global de capacitaciones
	public static final List<Capacitacion> listaCapacitaciones = new ArrayList<>();

    private int idCapacitacion;      // Identificador interno
    private String rutCliente;       // RUT del cliente asociado
    private String dia;              // Día de la semana ("lunes" … "domingo")
    private LocalDateTime hora;      // Fecha + hora de inicio
    private String lugar;            // Lugar de la charla (10–50 chars)
    private String duracion;         // Duración en minutos, como texto
    private int cantidadAsistentes;  // <1000 asistentes

    /** Constructor vacío (necesario para frameworks o deserialización). */
    public Capacitacion() { }

    /**
     * Constructor con todos los atributos.
     *
     * @param idCapacitacion     Identificador interno
     * @param rutCliente         RUN del cliente
     * @param dia                Día de la semana
     * @param hora               Fecha y hora de inicio
     * @param lugar              Lugar de la capacitación
     * @param duracion           Duración en minutos (texto)
     * @param cantidadAsistentes Número de asistentes (<1000)
     */
    public Capacitacion(int idCapacitacion,
                        String rutCliente,
                        String dia,
                        LocalDateTime hora,
                        String lugar,
                        String duracion,
                        int cantidadAsistentes) {
        this.idCapacitacion    = idCapacitacion;
        this.rutCliente        = rutCliente;
        this.dia               = dia;
        this.hora              = hora;
        this.lugar             = lugar;
        this.duracion          = duracion;
        this.cantidadAsistentes= cantidadAsistentes;
    }

    // ————— Getters y setters ——————————————————————————————————

    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    // ————— Métodos de negocio ——————————————————————————————————

    /**
     * Constructor fábrica que lee datos por consola y registra
     * la capacitación en la lista estática.
     */
    public static void crearCapacitacion() {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter hf = DateTimeFormatter.ofPattern("HH:mm");
        scan.close();
        System.out.println("\n--- Registrar Nueva Capacitación ---");
        System.out.print("ID Capacitación: ");
        int id = Integer.parseInt(scan.nextLine().trim());

        System.out.print("RUN Cliente: ");
        String rut = scan.nextLine().trim();

        System.out.print("Día de la semana: ");
        String dia = scan.nextLine().trim();

        System.out.print("Fecha (dd-MM-yyyy): ");
        LocalDate fecha = LocalDate.parse(scan.nextLine().trim(), df);

        System.out.print("Hora (HH:mm): ");
        LocalTime hora = LocalTime.parse(scan.nextLine().trim(), hf);

        System.out.print("Lugar (10–50 chars): ");
        String lugar = scan.nextLine().trim();

        System.out.print("Duración (minutos): ");
        String dur = scan.nextLine().trim();

        System.out.print("Cantidad asistentes (<1000): ");
        int cant = Integer.parseInt(scan.nextLine().trim());

        // Crea y agrega a la lista global
        Capacitacion cap = new Capacitacion(
            id, rut, dia,
            LocalDateTime.of(fecha, hora),
            lugar, dur, cant
        );
        listaCapacitaciones.add(cap);
        System.out.println("✅ Capacitación registrada correctamente.");
    }
   
    /**
     * Devuelve la lista global de capacitaciones.
     */
    public static List<Capacitacion> getCapacitaciones() {
        return listaCapacitaciones;
    }


    /**
     * Muestra un mensaje con el detalle de la capacitación:
     * “La capacitación será en A a las B del día C, y durará D minutos”
     */
    public String mostrarDetalle() {
        String horaStr = hora.format(DateTimeFormatter.ofPattern("HH:mm"));
        return String.format(
            "La capacitación será en %s a las %s del día %s, y durará %s minutos",
            lugar, horaStr, dia, duracion
        );
    }

    /**
     * toString() formateado con fecha DD/MM/yyyy y hora HH:mm.
     */
    @Override
    public String toString() {
        String fechaStr = hora.toLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String horaStr  = hora.format(DateTimeFormatter.ofPattern("HH:mm"));
        return String.format(
            "Capacitación[id=%d, cliente=%s, fecha=%s, hora=%s, lugar=%s, duración=%s, asistentes=%d]",
            idCapacitacion, rutCliente, fechaStr, horaStr, lugar, duracion, cantidadAsistentes
        );
    }
 
    }

