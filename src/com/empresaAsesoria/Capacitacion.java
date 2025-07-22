package com.empresaAsesoria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Capacitacion {

    private int idCapacitacion;
    private String rutCliente;
    private String dia;                // lunes…domingo
    private LocalDateTime hora;        // fecha+hora
    private String lugar;
    private String duracion;           // en minutos, como texto
    private int cantidadAsistentes;    // < 1000

    public Capacitacion() { }

    public Capacitacion(int idCapacitacion,
                        String rutCliente,
                        String dia,
                        LocalDateTime hora,
                        String lugar,
                        String duracion,
                        int cantidadAsistentes) {
        this.idCapacitacion      = idCapacitacion;
        this.rutCliente          = rutCliente;
        this.dia                 = dia;
        this.hora                = hora;
        this.lugar               = lugar;
        this.duracion            = duracion;
        this.cantidadAsistentes  = cantidadAsistentes;
    }

    // Getters y setters 
    /** getter público para que otros vean el RUT */
    public String getRutCliente() {
        return rutCliente;
    }

    /** setter… */
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    
    
    /**  
     * “La capacitación será en A a las B del día C, y durará D minutos”  
     */
    public String mostrarDetalle() {
        String horaStr = hora.format(DateTimeFormatter.ofPattern("HH:mm"));
        return String.format(
            "La capacitación será en %s a las %s del día %s, y durará %s minutos",
            lugar, horaStr, dia, duracion
        );
    }

    @Override
    public String toString() {
        String fecha = hora.toLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String horaStr = hora.format(DateTimeFormatter.ofPattern("HH:mm"));
        return String.format(
            "Capacitación[id=%d, cliente=%s, fecha=%s, hora=%s, lugar=%s, duración=%s, asistentes=%d]",
            idCapacitacion, rutCliente, fecha, horaStr, lugar, duracion, cantidadAsistentes
        );
    }

	public String getIdCapacitacion() {
		return null;
	}
}
